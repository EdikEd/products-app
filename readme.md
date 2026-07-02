# Products App

Simple application that displays customer products and allows disabling active products.

## Tech Stack

- Java 17
- Spring Boot
- Maven
- React
- TypeScript
- Material UI

## Project Structure

```
products-app/
├── backend
└── frontend
```

## Backend

```bash
cd backend
.\mvnw.cmd spring-boot:run
```

Backend runs on:

```
http://localhost:8080
```

## Frontend

```bash
cd frontend
npm install
npm run dev
```

Frontend runs on:

```
http://localhost:5173
```

## API

### Get products

```
GET /api/products
```

### Disable product

```
POST /api/products/{id}/disable
```

## Assumptions

- Products are stored in memory.
- No database is used.
- Product state is preserved only while the application is running.
- Single customer is assumed.

## Possible Improvements

If I had more time, I would add:

- unit tests
- integration tests
- global exception handling
- loading indicator
- confirmation dialog before disabling a product
- environment configuration for API URL
- Docker support
