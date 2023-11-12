# Api-Pagination-Demo

This is a demo project to show how to implement pagination in a REST API using Spring Boot.


## Try it 
```bash
curl -X GET http://localhost:8080/api/v1/person?page=0&size=2
```

```json
{
  "content": [
    {
      "id": 1,
      "firstName": "Keneth",
      "lastName": "Gerlach",
      "phoneNumber": "1-590-109-6548",
      "email": "lavern.toy@yahoo.com",
      "address": {
        "id": 1,
        "address": "8101 Harber Isle",
        "city": "Kuvalisport",
        "state": "Oregon",
        "zip": "87187-4763"
      }
    },
    {
      "id": 2,
      "firstName": "Chuck",
      "lastName": "Wyman",
      "phoneNumber": "(967) 317-9075 x18320",
      "email": "cornelia.doyle@hotmail.com",
      "address": {
        "id": 2,
        "address": "8010 Dannielle Springs",
        "city": "New Brianaburgh",
        "state": "Michigan",
        "zip": "55031"
      }
    }
  ],
  "pageable": {
    "pageNumber": 0,
    "pageSize": 2,
    "sort": {
      "sorted": false,
      "empty": true,
      "unsorted": true
    },
    "offset": 0,
    "paged": true,
    "unpaged": false
  },
  "last": false,
  "totalPages": 50,
  "totalElements": 100,
  "first": true,
  "size": 2,
  "number": 0,
  "sort": {
    "sorted": false,
    "empty": true,
    "unsorted": true
  },
  "numberOfElements": 2,
  "empty": false
}
```