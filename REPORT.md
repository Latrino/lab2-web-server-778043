# Lab 2 Web Server -- Project Report

## Description of Changes

Se han realizado las siguientes modificaciones en el proyecto original:

- Creación e implementación de una Whitelabel Error Page personalizada.
- Creación del endpoint `/time` que devuelve la hora actual en formato JSON.
- Creación de test para el endpoint `/time` utilizando MockMvc.
- Habilitar HTTP/2 en el servidor web y SSL con un certificado autofirmado.

## Technical Decisions

- La página de error personalizada se basa en la plantilla Whitelabel Error Page de Spring Boot, adaptada para cumplir con los requisitos del proyecto, utilizando Spring Boot para su despliegue automático en caso de error.
- El endpoint `/time` se implementa en un controlador REST que devuelve la hora actual en formato JSON.
- Se utiliza MockMvc para crear tests unitarios que verifiquen el correcto funcionamiento del endpoint `/time`.
- La configuración de HTTP/2 y SSL se realiza en el archivo `application.properties`, utilizando un certificado autofirmado para el entorno de desarrollo.

## Learning Outcomes

- Aprendizaje sobre la creación de páginas de error personalizadas en Spring Boot.
- Comprensión del uso de MockMvc para la creación de tests en Spring Boot.
- Configuración de HTTP/2 y SSL en un servidor web Spring Boot.
- Mejoras en la comprensión de gradlew para corregir errores de compilación, y mantener el diseño del proyecto.

## AI Disclosure

### AI Tools Used

- Copilot (GitHub) - Utilizado para completar código principalmente.
- DeepSeek (Modo DeepThink) - Utilizado para consultar dudas mas profundas sobre el funcionamiento de MockMvc.

### AI-Assisted Work

- El contenido de error.html, basado en la plantilla Whitelabel Error Page de Spring Boot. A partir del diseño base aportado por Copilot, se han realizado modificaciones de diseño.
- Una primera versión del test para el endpoint `/time`, generada por Copilot y posteriormente adaptada. A partir de esa versión, investigué y aprendí sobre MockMvc para entender su funcionamiento, y replantee practicamente todo el test personalmente.
- Ultimos retoquers en el test, para arreglar eroores (orden de los imports,...).

### Original Work

- Diseño del endpoint `/time` y su implementación.
- Configuración de HTTP/2 y SSL en el servidor web.
- Investigación y aprendizaje sobre MockMvc para la creación de tests.
- Código del test final (imports generados por IA)
