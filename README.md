
# GreenStitch Coding Assignment

This repository contains the backend code for the GreenStitch Coding Assignment. It provides a RESTful API for user registration, authentication, and other functionalities.

## Prerequisites:

Before running the Campus Placements API, ensure that you have the following installed:

    1. Java Development Kit (JDK) 8 or higher
    2. Your preferred IDE (e.g., IntelliJ, Eclipse)
    3. Postman App
    
## Setup:

    1. Clone the repository:

        git clone {repository url}

    2. Open the project using IDE

    3. Load the dependencies

    4. Run the GreenStitchCampusPlacementsApplication.java from package src.main.com.GreenStitch.CampusPlacements

The API will be accessible at http://localhost:8080

## API Endpoints:

### 1. Register New User:

Register a new user for the campus placements.

#### Endpoint: POST /signUp
    
    Request Payload: UserDto (User Data Transfer Object)
        
        username (String, required): The unique username for the user.
        password (String, required): The password for the user's account.

#### Example Request:

URL: http://localhost:8080/signUp

    {
        "username": "user1",
        "password": "userpassword"
    }

Note: Pass the above object in JSON format.

Response: HTTP 201 Created with the registered user details.

    {
        "id": 1,
        "username": "user1"
    }

Note: Password will not be shown in response due to security purposes.

### 2. Sign-In User:

#### Endpoint: POST /signIn

Authenticate and sign in an existing user. Use basic auth in the authorization header.

#### Example Request:

URL: http://localhost:8080/signIn

![image](https://github.com/Shubham-Dandekar/GreenStitchCampusPlacements/assets/107460330/053f4565-564c-426f-9343-ebddb121b69b)

Response: HTTP 202 Accepted with a success message
    
    user1 logged in successfully

### 3. Hello User:

#### Endpoint: GET /hello

A simple endpoint to greet user accessed upon successful signIn.

#### Example Request:

Note: Access the JWT Token from the signIn response header and pass it in authorization's Barear Token.

![image](https://github.com/Shubham-Dandekar/GreenStitchCampusPlacements/assets/107460330/23ec5392-ed09-423f-995d-5c4d002e82a3)

Response: HTTP 200 OK with a success message

    Hello from GreenStitch

### Error Handling

The API handles various error scenarios and returns appropriate HTTP status codes and error messages in the response.


### Security

The API uses JWT (JSON Web Tokens) for authentication. Upon successful registration and sign-in, the user receives a JWT token that should be included in the Authorization header of subsequent requests.
