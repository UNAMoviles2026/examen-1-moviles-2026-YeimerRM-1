# Diseño Backend

## Stack Tecnológico
Se utilizará .NET 8 con C# para el desarrollo del API REST, aprovechando su alto rendimiento y robustez.

## Arquitectura en capas
La arquitectura que se implementara es en base a separación de responsabilidades:

1.  **Capa Presentation:** En esta se definen los endpoints que tiene el API y se gestionan las peticiones de HTTP como por ejemplo SpacesController y ReservationsController.

2.  **Capa Business:** Esta capa es la encargada de la lógica de negocio, validaciones de disponibilidad y los cálculos que se realicen

3.  **Capa Data:** Esta capa es quien abstrae la persistencia de los datos  a trabes de Entity Framework Core

4.  **Modelos y DTOs:** Esto es la separacion entre las entidades de la base de datos y la transferencia de los objetos de datos. Se tiene Space, CreateReservationRequest y SpaceResponse.

## Persistencia
Para el almacenamiento de los datos se propone el uso de SQL Server y SQLite y que estos se gestionen a trabes de migraciones de EF Core para mantener la base dados sincronizada con el código.

## Flujo de una Petición
1.La aplicación móvil envía una solicitud como por ejemplo `POST /api/reservations`.
2. El Controller recibe el DTO y lo envía al Service.
3. El Service valida que el espacio esté disponible y no haya choques de horario.
4. El Repository guarda en la base de datos.
5. El Mapper convierte la entidad a un objeto de respuesta `Response` que se devuelve al móvil.

## Justificación
Esta estructura es la que se recomienda ya que es una que garantiza la mantenibilidad, escalabilidad y facilidad de pruebas unitarias.
