# Hotel Management System

A simple hotel management system built with Java, Spring Boot, and PostgreSQL.

## Features

- Manage hotels
- RESTful API
- Consists of the following pages:
    - Home
    - About
    - Rooms
        - List all rooms
        - Add new room form
    - Guests
        - List all guests
        - Add new guest form
    - Reservations
        - List all reservations
        - Add new reservation form

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/hotel-management-system.git
    ```
2. Navigate to the project directory:
    ```bash
    cd hotel-management-system
    ```
3. Open the project in IntelliJ IDEA.

4. Configure PostgreSQL in `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/hotel_management
    spring.datasource.username=root
    spring.datasource.password=abc123
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.hibernate.ddl-auto=update
    ```

5. Run the project from IntelliJ IDEA.

## Motivation

I created this app to showcase my skills and abilities in JavaScript. It serves as a practice project to enhance my coding proficiency and demonstrate my capacity to write clean and functional code.

## Live Demo

Check out the live demo [here](https://hotel-ms1.netlify.app/).

## motivation

i make this basic HMS to practice and know my capability of doing great project i am happy you see this

## Contributing

Feel free to submit issues or pull requests to improve the game.

## License

This project is licensed under the MIT License.
