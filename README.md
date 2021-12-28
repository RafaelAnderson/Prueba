# Prueba
Repositorio para pruebas

```
// Bloque de código
for(int i = 0; i < 10; i++) {
printf(“Valor de i = %d”, i)
}
```
1. Creación de `environment.dev.ts` en la ruta `src/environments`
2. En el archivo `environment.dev.ts` agregar lo siguiente:
```
export const environment = {
  production: false,
  name: 'dev'
};
```
 
3. En el archivo `environment.prod.ts` agregar lo siguiente: 
```
export const environment = {
  production: true,
  name: 'prod'
};
```
4. En el archivo de la raíz angular.json, cambiar el valor del outputPath:
```
"projects": {
      "architect": {
        "build": {
          "options": {
            "outputPath": "dist",
```
