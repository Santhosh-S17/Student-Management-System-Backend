🛒 E-Commerce Backend API (Spring Boot + JWT)

A **production-ready E-Commerce Backend System** built using Spring Boot, implementing secure authentication, role-based authorization, and complete order management.

This project demonstrates real-world backend architecture used in modern applications.

---

# 🚀 Key Highlights

✔ Secure authentication using JWT
✔ Role-based access control (ADMIN / USER)
✔ Scalable layered architecture
✔ DTO-based API design (clean & secure)
✔ Swagger UI for API testing
✔ MySQL database with JPA/Hibernate

---

# 📌 Features

## 🔐 Authentication & Security

* User Registration
* Login with JWT Token
* Role-based Authorization (USER / ADMIN)
* Protected APIs using Spring Security

---

## 👤 User Module

* Register new users
* Fetch user details
* Role assignment (USER / ADMIN)

---

## 🛍️ Product Module

* Add new products (ADMIN only)
* View all products
* Delete products (Soft Delete recommended)

---

## 🛒 Cart Module

* Add items to cart
* Update product quantity
* Remove items from cart

---

## 📦 Order Module

* Place order using cart/items
* Calculate total price
* View order history by user

---

# 🏗️ Project Architecture

```text
Controller → Service → Repository → Database
              ↓
           DTO Layer
              ↓
          Security Layer (JWT)
```

---

# 📂 Project Structure

```text
com.santhosh.ecommercebackend
│
├── controller       # REST API endpoints
├── service          # Business logic
├── repository       # Database interaction
├── entity           # Database models (JPA)
├── dto              # Request & Response objects
├── security         # JWT & authentication logic
├── config           # Security configuration
└── exception        # Global exception handling
```

---

# 🔐 Authentication Flow

1️⃣ Register user
2️⃣ Login → Receive JWT Token
3️⃣ Use token in request header

```text
Authorization: Bearer <JWT_TOKEN>
```

---

# 🧪 API Endpoints

## 👤 User

* `POST /api/users/register`

## 🔐 Auth

* `POST /api/auth/login`

## 🛍️ Product

* `POST /api/products` (ADMIN)
* `GET /api/products`
* `DELETE /api/products/{id}` (ADMIN)

## 🛒 Cart

* `POST /api/cart/add`
* `PUT /api/cart/update`
* `DELETE /api/cart/remove/{cartItemId}`

## 📦 Order

* `POST /api/orders`
* `GET /api/orders/user/{userId}`

---

# 📊 Database Design

Main Tables:

* Users
* Products
* Cart
* CartItems
* Orders
* OrderItems

---

# ⚙️ Setup Instructions

## 1️⃣ Clone Repository

```bash
git clone https://github.com/Santhosh-S17/ecommerce-backend.git
```

---

## 2️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

---

## 3️⃣ Run Application

```bash
mvn spring-boot:run
```

---

## 4️⃣ Access Swagger UI

```text
http://localhost:8080/swagger-ui/index.html
```

---

# 🔥 Important Concepts Used

* DTO Pattern (Data Transfer Object)
* Layered Architecture
* JWT Authentication
* Role-based Authorization
* REST API Design
* JPA Relationships

# 🧠 Challenges Solved

* Handling foreign key constraints (Product deletion issue)
* Securing APIs with JWT
* Separating DTO and Entity layers
* Managing cart and order relationships

---

# 👨‍💻 Author

**Santhosh**

---

# ⭐ Support

If you found this project helpful:

👉 Star this repository
👉 Share it with others

---

# 💼 Resume Tip

You can describe this project as:

> Built a secure and scalable E-Commerce Backend using Spring Boot with JWT authentication, role-based authorization, and full order management system.
