# Spring Data Rest & HAL Explorer

---

- dependencies 

---

Default Implementations:

- GET  /data-api/books
- GET  /data-api/books/{id}
- PUT  /data-api/books/{id}
- POST /data-api/books
- PATCH  /data-api/books/{id}
- DELETE  /data-api/books/{id}


Custom Implementations:

- GET /data-api/books/search/addNewBook?{QueryParam}
- ...

```
curl --location 'http://localhost:8092/data-api/books/search/addNewBook?name=math&page=165'
```

