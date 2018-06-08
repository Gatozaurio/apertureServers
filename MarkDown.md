

- **Nombre de la aplicación:** Aperture Servers
- **Integrantes del grupo:** Javier Adrián Martínez Castellano, Guillermo Jesús Cano Rama, José Alberto Távora Romero.
- **Introducción:** La aplicación será una página web de hosting, dedicada al alquiler, configuración y mantenimiento de servidores de videojuegos.

- **Herramientas usadas:** 

  - GitHub.
  - Slack.
  - Typora: hemos elegido esta herramienta por su simpleza, en clase acostumbramos a tomar apuntes con el blog de notas y Typora se asemeja mucho, sólo que visualmente es bastante más atractivo, e incluye opciones de edición.
  - Balsamiq: escogemos utilizar Balsamiq por lo intuitivo que es, es bastante sencillo realizar los mockups sin necesidad de consultar manuales o tutoriales.
  - Gimp: utilizamos Gimp para el retoque de los mockups y la realización del logo, al haberlo estudiado en el grado medio lo manejamos con bastante soltura.
  - LucidChart: utilizamos esta herramienta para realizar los diversos diagramas que exige el proyecto.


- **Mockup**: 

  - Página principal de la web, donde aparecen características básicas de nuestro hosting, un menú de navegación y la opción de logearse:

    ![](imagenes/Home.png)

  ​

  - Formulario de registro:

    ![](imagenes/Registro.png)

  ​

  - Características de nuestro servidor:

    ![](imagenes/Características.png)

    ​

  - Servidores para juegos que ofrecemos:

    ![](imagenes/Servidores.png)

    ​

  - Sistema de patrocinador:

    ![](imagenes/Sponsor.png)

    ​

    - Menú de edición de perfil:

    ![](imagenes/EdiciónPerfil.png)

    ​

  - Ventana de Error 404:

    ![](imagenes/Error404.png)

    ​

    **Diagrama de objetos:**

  ![](imagenes/clases.png)




- **Diagrama de objetos:**

  ​	 ![](imagenes/objetos.png)

  ​

- **Fichas de casos de uso:**

  ![](imagenes/FichaCambioPass.png)

  ![](imagenes/FichaRegistroUno.png)

  ![](imagenes/FichaRegistroDos.png)


![](imagenes/FichaAlquilarServidor.png)

![](imagenes/FichaCambioNombre.png)



- **Diagramas de casos de uso:**

  ![](imagenes/DiagramaAlquiler.png)

  ![](imagenes/DiagramaSponsor.png)

  ![](imagenes/DiagramaCambios.png)

  ![](imagenes/DiagramaRegistrarLogearse.png)




- **Diagramas de actividades:**

  ​				![](imagenes/DiagramaActividadesCambioContraseña.png)				![](imagenes/DiagramaActividadesRegistro.png)

  ![](imagenes/DiagramaActividadesCambioNombre.png)

  ![](imagenes/DiagramaActividadesLogearse.png)

  ​

- **Arquitectura web:**

  Hemos escogido la arquitectura REST por varias razones:

  - La mayoría de las páginas conocidas(Amazon, Mega...) utiliza esta arquitectura, es la que está teniendo mayor impacto ahora mismo.
  - Puede usarse desde cualquier cliente HTTP y es mucho mas simple.
  - Es un protocolo sin estado, es decir, no guardamos información en el servidor, consiguiendo así un ahorro de variables de sesión y almacenamiento del servidor.
  - Presenta operaciones bien definidas como pueden set GET, POST o PUT.
  - Utiliza URL's únicas. Las URL's únicas estan identificadas por URI's(Identificador Único de Recurso). Un URI debe ser único, independiente de formato y mantener una jerarquía lógica, entre sus características más comunes.

  Todo esto ayuda a nuestra página ser más cercana al usuario y cómoda.

  ​

- **Tecnologías del frontend:**

    - **Lenguaje**: JavaScript, HTML, CSS.


    - **Core**: NodeJS - Es uno de los mejores framworks de JS actualmente y nos ha resultado el más atractivo.
    - **Frontend Framework:** AngularJS - Es el que está mas extendido entre los desarrolladores y lleva bastantes años siendo usado.
    
    - **UI Framework:** Bootstrap - Hemos visto lo que es posible hacer con Bootsrap y nos ha parecido el mejor con diferencia.
    
    - **Editores de texto**: Sublime Text - De los pocos editores que hemos probado, éste es el que más nos ha gustado y el que usamos regularmente.
    
    - **Control de versiones:** GitHub - Es poco intuitivo, pero es lo único que medianamente sabemos usar.
    
    - **Gestión de paquetes:** Bower - Utiliza NodeJS y nos ha parecido una herramienta muy potente y útil.
    
    - **Preprocesador CSS:** Sass - Es muy potente y parece fácil de usar.
    
    - **Preprocesador JS:** Babel - Tiene muy buenas opiniones por parte de los desarrolladores y en la página oficial explica muy bien como utilizarlo.
    
    - **Automatización de tareas:** Grunt - Al parecer es muy potente y uno de los más utilizados.
    
    - **Calidad de código:** JSHint - Es bastante útil para optimizar el código y explica muy bien como hacerlo.
    
    - **Testing:** Mocha - Utiliza NodeJS y es fácil de usar aparentemente.
    
    - **Template Engine:**  Jade - También utiliza node y nos ha parecido el mejor de todos los que hemos encontrado.
    
    - **Frontend performance:** Google PageSpeed - Parece una herramienta bastante buena, y el que sea de google inspira confianza.
    
    - **Browser refreshing:**  Browsersync - Funciona con NodeJS y además tiene muchas funcionalidades útiles.
    
    - **Build tools:** RequireJS - Puede ser utilizado en NodeJS y es compatible con la mayoría de navegadores.
    
    - **Style Guide:** Knyle Style Sheets - Es una buena metodología para documentar CSS y generar guías de estilo, además fue creado por el director de diseño de GitHub.


- **Tecnologías del backend:**

  Hemos escogido Javascript como Lenguaje de Programación, Oracle WebLogic como Servidor De Datos, Oracle  como Base de Datos y Linux Server como Servidor.

  Javascript lo hemos escogido por su versatilidad, y el boom que está teniendo actualmente.

  Hemos escogido Oracle WebLogic y Oracle como base de datos por su compatibilidad y facilidad al momento de usarlo.

  Hemos escogido Linux Server por su capacidad de añadir nuevos componentes y el hecho de que sea Software Libre.

  ​

- **CMS:**

  Hemos escogido Wordpress por varias razones:

  - Siempre va a estar siendo actualizado y con nuevas funciones por el hecho de que es open source, dejando a los demas desarrolladores contribuir con este magnífico proyecto.

  - No es necesario indagar en un lenguaje de programación, ya que no requiere conocimiento en tal campo, cómoda de utilizar por el usuario final.

  - Es personalizable, tanto con plantillas como contactando con diseñadores profesionales. El diseño es Responsive totalmente, adaptado a pantallas de cualquier tamaño y dispositivos como smartphones.

  - Tu página es totalmente tuya, Wordpress te la ofrece, puedes añadir, quitar, editar...todo lo que te venga en mente.

    ​

- **DevOps:**

  - Nombre de la herramienta: Git

  - Categoría: Código

  - Explicar en que consiste: Permite a varios desarrolladores trabajar sobre el mismo código.

  - Características principales:

    - Trabaja principalmente a nivel local.
    - Tiene un nivel muy alto de integridad.
    - No puedes recibir archivos dañados.

  - Diferencias con otra herramienta similar: En comparación con otros, Git es una herramienta open source, además, a diferencia del resto, su almacenamiento de información no es lineal, sino más parecido a trabajar con ficheros.

    ​

  - Nombre de la herramienta: GitLab

  - Categoría: Cónstrucción.

  - Explicar en que consiste: Ayuda a gestionar repositorios en un servidor centralizado.

  - Características principales:

    - Gran escalabilidad
    - Open core.
    - Eficiente.

  - Diferencias con otra herramienta similar: Al contrario que otros, GitlLab no necesita instalar integración continua y entrga continua de forma separada, sino que los implementa conjuntamente.

    ​

  - Nombre de la herramienta: Parasoft.

  - Categoría: Prueba.

  - Explicar en que consiste: Ayuda a automatizar el testeo de nuestro software.

  - Características principales:

    - Análisis estático.
    - Pruebas unitarias.
    - Test automáticos funcionales.

  - Diferencias con otra herramienta similar:  A diferencia de otras herramientas Parasoft es bastante fácil de utilizar e intuitivo, evitando que tengamos que estar constantemente buscando información sobre su uso.

    ​

  - Nombre de la herramienta: Artifactory.

  - Categoría: Paquete.

  - Explicar en que consiste: Es un gestor de repositorio binario.

  - Características principales:

    - Soporta todos los formatos.
    - Totalmente automatizado e integrado.
    - Gran disponibilidad

  - Diferencias con otra herramienta similar:Artifactory es el único gestor que soporta todos los paquetes de aplicaciones.

    ​

   - Nombre de la herramienta: BuildMaster.

  - Categoría: Lanzamiento.

  - Explicar en que consiste: Con esta herramienta podemos desplegar nuestra aplicación.

  - Características principales:

    - Permite lanzar la apliación de forma fiable en cualquier entorno.
    - Gran escalabilidad.

  - Diferencias con otra herramienta similar: Al contrario que otros, BuildMaster no equiere ningún tipo de registro para su descarga y hay bastante documentación al respecto.

    ​

  - Nombre de la herramienta: Terraform.

  - Categoría: Configurar.

  - Explicar en que consiste: Permite gestionar la infraestructura del código.

  - Características principales:

    - Es una heramienta de código abierto.
    - Ofrece una vista previa de los cambios que realizará la herramienta para evitar sorpresas.
    - Amplia disponibilidad

  - Diferencias con otra herramienta similar: Lo que nos ha llevado a elegir Terraform es la cantidad de información, guías y pasos a seguir que hay en su web, además permite su utilización en casi cualquier plataforma.

    ​

  - Nombre de la herramienta: Ganglia.

  - Categoría: Monitor.

  - Explicar en que consiste: Permiteobservar el rendimiento de nuestra aplicación y hacernos una idea de la experiencia del usuario final.

  - Características principales:

    - Es una heramienta de código abierto.
    - La herramienta lleva muchos años a sus espaldas.
    - Es gratuita.

  - Diferencias con otra herramienta similar: La comunidad de usuarios de esta herramienta pone a nuestra disposición gran cantidad de plugins y documentación que nos podría ser muy útil.




- **Cookies:**

  ¿Para que queremos usar las cookies?

  - Para obtener las preferencias de nuestros clientes, y así poder poner anuncios relacionados con sus preferencias y gustos.

  - Para recordar el nombre y contraseña del usuario.

  - Facilitar la implementación de funcionalidades, como puede ser el alquiler de un servidor.

    ​

- **Nube:**

    - Tipo de nube elegida: Software como servicio
      - Características: La nube ofrece un servicio por
        demanda, no tienen que preocuparte en instalar, configurar y correr la aplicación en tu
        equipo, porque la aplicación te la ofrece la nube

      - Para que la vamos a usar en nuestro proyecto: Lo usamos para almacenar configuraciones del servidor por defecto, pudiendo copiar las características de un servidor en la nube hasta un servidor físico.

  ​

- **Blockchain:**

  Un ejemplo perfecto para nuestro blockchain sería el uso de la cartera del cliente para alquilar un servidor. 

  Su uso sería que el cliente elige un servidor, tras esto, se le retira el dinero de su cartera, cual se transforma en un bloque. Tras esto se envía a todas las partes de la red, si se valida, pasa a la cadena y sino, avisara al cliente de que no es valido, y tras esto la cadena se envía a la cartera de la compañía

  Su ventaja principal es el registro indeleble y la transparencia de las transacciones. Además de la seguridad y la eliminación de los terceros en una transacción.

  ​

- **Big Data**:

   Los datos que pueden convertirse en Big Data son las configuraciones de nuestro servidores y sus transacciones de datos. 
     MongoDB almacena la base de datos y Hadoop consume esos datos para mezclarlos con datos de otras fuentes, los resultados se vuelven a cargar en la BBDD de MongoDB.

    - Nombre de la tecnología: Hadoop.

    - Caracteristicas: Es un framework estandar para el almacenamiento de grandes volúmenes de datos. Se usa para analizar y procesar.

   La biblioteca Hadoop utiliza modelos de programación simples para el almacenamiento y procesamiento distribuido de grandes conjuntos de datos en clusters, dando redundancia para no perder nada y aprovechar muchos procesos a la vez.

   Dispone de un sistema de archivos distribuido y se basa en el proceso MapReduce.

   Soporta diferentes sistemas operativos y también se usa frecuentemente sobre cualquiera de las principales plataformas de nube.

   - Comparación: Podemos observar que  es la mas utilizada y es gracias a su open source, su MapReduce y su compatibilidad, por ello, es mejor que otras en su campo.


     - Nombre de la tecnología: MongoDB.
     - Características: Es una BBDD NoSQL, con un concepto muy diferente al de las bases de datos relaciones. 

  Es una base de datos orientada a documentos, cuales son almacenados en BSON. 

  MongoDB tiene un ambito de aplicación mas amplio en diferentes tipos de proyectos. 

  - Comparación: Como podemos observar, es una base de datos NoSQL que tiene una gran escalabilidad comparada con el resto y trabaja en documentos en vez de con registros, cual puede ser verdaderamente útil para guardar los datos de servidores que queremos usar en nuestra aplicación.

  - **Middleware**:

    -Laravel, un framework que trabaja con PHP y tiene pocos requisitos de sistema pudiendo tener un entorno de desarrollo local en una máquina virtual sin problemas. Trabaja en la autenticación y gestión de sesiones ahorrándonos mucho trabajo.

    -Express, infraestructura web de direccionamiento y middleware que tiene una funcionalidad mínima propia. as funciones de middleware son funciones que tienen acceso al objeto de solicitud (req), al objeto de respuesta (res) y a la siguiente función de middleware en el ciclo de solicitud/respuestas de la aplicación. La siguiente función de middleware se denota normalmente con una variable denominada next.

    ​



- **Bibliografía**:

  - https://typora.io
  - http://support.typora.io
  - https://balsamiq.com
  - https://www.creativosonline.org
  - http://www.gimp.org.es

