# Arquitectura del Sistema Móvil

## Tipo de Aplicación
La aplicación móvil que se realiza es nativa para Android y que además esta implementa Jetpack Compose que es el framework moderno de UI.

## Patrón de Arquitectura
El patrón que se utiliza en la aplicación móvil es MVVM para que este tenga una clara separación de responsabilidades.

## Componentes de la Arquitectura
*   **Model:** En la clase de datos se encuentra Space y Reservation que estos son los que representan la información de negocio.

*   **View:** En esta capa se enceuntran lo que son los Screens y Components que son las interfacer de usuario que van a reaccionar con el estado expuesto por el ViewModel.
En estas s eutlizan componentes como Scaffold, LazyColumn y Card. 

*   **ViewModel:** Esta capa es la que se encarga de gestionar el estado que la UI y la comunicación con la capa de datos mediante StateFlow.

*   **Repository:** Esta capa se encarga de abstraer el origen de los datos que actualmente esta implentado con MockSource, pero tambien esta preparado para integrar Retrofit.

## Flujo de Datos
1.  La view esta observando un StateFlow de la ViewModel.

2. Cuadno se interactua mediante un clic de reservación, el viewModel llama a una función del Respository.

3. La solicitud que se hace la procesa el Repository y este retorna una respuesta.

4. EL viewModel actualiza el estado de la UI y view se recompone automáticamente.

## Tecnologías Utilizadas
*   **Navigation Compose:** Para el manejo de rutas y paso de parámetros entre pantallas.
*   **Material Design 3:** Para una interfaz moderna y coherente con las guías de diseño de Android.
*   **Kotlin Coroutines & Flow:** Para el manejo de operaciones asíncronas y flujo de datos reactivo.

## Justificación
Esta arquitectura garantiza que el código sea testeable, fácil de mantener y permite agregar nuevas funcionalidades esto siendo como un backend real o persistencia local sin afectar la lógica de presentación.
