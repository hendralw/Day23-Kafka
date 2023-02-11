# Day23-Kafka

endpoint  | method | request body
------------- | ------------- | -------------
localhost:8080/api/v1/hello | POST | {"message":"Hello Kafka"}
localhost:8080/api/v1/book | POST | {"message":"Book Kafka"}
localhost:8080/api/v1/bag | POST | {"message":"Bag Kafka"}
localhost:8080/api/v1/pencil | POST | {"message":"Pencil Kafka"}

- Jalankan aplikasi java, kemudian gunakan Postman untuk melalukan request pada endpoint yang tersedia.
Maka akan mendapatkan log info sebagai response dari listener kafka.

![image](https://user-images.githubusercontent.com/49546149/218285127-95106b07-3d6b-488c-ac68-8648195a68c2.png)
