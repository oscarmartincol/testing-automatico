# Conceptos principales de Testing

## Principios de Testing

1. La **prueba** muestra la presencia de defectos, no su ausencia.
2. La **prueba** exhaustiva es imposible.
3. La **prueba** temprano ahorra tiempo y dinero.
4. Los defectos se agrupan.
5. Cuidado con la paradoja del pesticida.
6. La **prueba depende** del contexto.
7. La ausencia de errores es una falacia.

***

## Niveles de prueba

### Componente

**Unit test** que se hace del **código** cuando se **está** comenzando a realizar.

### Integración

**Cómo** los componentes se integran al sistema o si se tienen que tomar recursos externos.

### Sistema

Una vez creado el software, se prueba la **funcionalidad** y **cómo** se integra.

### Aceptación

Pruebas directamente con el producto listo.

***

## Tipos de prueba

### Pruebas funcionales

Se centran en que el software cumple con los requerimientos funcionales especificados.
Los **tests** de los componentes de **código**, se consideran **tests** de caja blanca. Los asociados al cambio que **también** se encuentran en los no funcionales **están** asociados a nuevas funcionalidades que se quieren implementar que necesitan ser probadas.

### Pruebas no funcionales

Se centran en los aspectos del software que no son funcionales, como el rendimiento, la seguridad, etc.

Las pruebas de **Retest** se utilizan cuando se presentan cambios grandes y se deben forzar nuevamente los **tests** para el correcto funcionamiento.

***

# Defectos

## Error

- Acción humana que produce un resultado incorrecto.
- Puede ocurrir durante cualquier fase del desarrollo de software.

## Defecto

- Manifestación de un error en el software.
- Puede ser detectado mediante pruebas.

## Falla

- Manifestación del defecto al utilizar el software.
- Es detectada por los usuarios finales.

***

## Reporte de defectos

No hay un modelo **estándar** para registrar los defectos en informes, aunque hay procedimientos para hacerlo con buenas **prácticas**. Estos informes son esenciales para transmitir los defectos al equipo de desarrollo y **así** ayudar al proceso de corrección.

**Prioridad**: **Qué** tan urgente es solucionar un defecto.
**Severidad**: **Qué** tan grave es un defecto.

***

## Ciclo de vida de un defecto

- Nuevo o inicial
- Asignado
- En progreso
- Corregido
- En espera de verificación
- En **verificación**
- Verificado
- Cerrado