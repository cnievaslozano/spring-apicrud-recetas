# API CRUD RECETAS

Crud sencillo sobre recetas de cocina, en springboot.

### Endpoints:
- Obtener todas las recetas [GET]:
````
    /api/v1/recetas 
````

- Obtener una receta [GET]:
````
    /api/v1/recetas/{id}
````

- Crear receta [POST]:
````
    /api/v1/recetas/
    
    Request Body Example:
    {
        "nombre": "Paella",
        "ingredientes": [
            "Arroz",
            "Pollo",
            "Mariscos",
            "Aceite"
        ],
        "instrucciones": "1. Sofreír el pollo...\n2. Añadir el arroz...",
        "categoria": "Plato principal",
        "tiempoPreparacion": 45,
        "porciones": 4,
        "dificultad": "Media",
        "imagenUrl": "https://example.com/paella.jpg"
    }
````

- Actualizar receta [PUT]:
````
    /api/v1/recetas
            
    Request Body Example:
    {
        "recetaId": 1,
        // datos a editar...
    }
````

- Borrar receta [DELETE]:
````
    /api/v1/recetas/{id}
````