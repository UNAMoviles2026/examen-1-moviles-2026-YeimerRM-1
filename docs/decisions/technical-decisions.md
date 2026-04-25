# Decisiones Técnicas

## Integraciones recomendadas

### Autenticación
Con esto la aplicación puede hacer que los usuarios gestionen las reservas de forma personalizada y más segura.

### Notificaciones Push
Con esto los usuarios estarán mas atentos las reservaciones realizadas y no se les olvidara ya que se les recordara las reservaciones próximas y cambios en disponibilidad.

### Pagos en línea
Esto es para que sea mas fácil el proceso de pago ya que será directamente desde la aplicación móvil.

### Geolocalización
Esto es para que los puedan encontrar espacios que estén cerca de su ubicación.

## Limitaciones Actuales y Mejoras Futuras

### 1. Integración Multimedia
La aplicación actualmente solo utiliza iconos para poder representar los espacios y una mejora importante seria integrar una librería para poder cargar imágenes reales desde una url suministrada por el backend y con esto mejorar la experiencia visual.

### 2. Persistencia de Datos Local
Los datos que hay actualmente son volátiles, se planea poder implementar el almacenamiento local para poder almacenar datos de forma local y permitir el acceso offline.

### 3. Selección Dinámica de Fechas
La reservación actual sea hace mediante una simulación de acción inmediata. Es necesario que se integre un componente para poder seleccionar la fecha y hora para poder permitir las reservaciones programadas.

### 4. Animaciones de Transición
EL diseño mantiene una navegación simple para poder priorizar la estabilidad. Se plantea poder agregar animaciones de transiciones entre las listas y el detalle.

### 5. Backend en Tiempo Real
Actualmente se tiene un repositorio de datos que es simulado, la integración de un API REST en .NET 8 es el siguiente paso a implementar.

## Justificación
Con las decisiones que se tomaron se permite entregar un producto mínimo que es viable y estable, esto debido al poco tiempo que se tiene de trabajo, además de que se deja una ruta clara para el escalamiento y profesionalización  de la plataforma.
