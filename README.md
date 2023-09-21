# QuizWiz

## Overview

QuizWiz is a quiz application developed using Java for the frontend and PHP with a MySQL database for the backend. This README file provides an overview of the project.

## Features

- User registration and authentication.
- Create and manage quizzes.
- Take quizzes and receive instant feedback.
- Admin panel for managing questions, users, and quiz data.
- RESTful API for communication between the frontend and backend.

## Technologies Used

- **Frontend**:
  - Java for Android app development.

- **Backend**:
  - PHP for server-side scripting.
  - MySQL for the database.

- **API**:
  - PHP API to connect the frontend with the backend.

## MVVM Architecture

QuizWiz is built using the Model-View-ViewModel (MVVM) architectural pattern, which separates the application into three main components:

- **Model**: Represents the data and business logic of the application. In QuizWiz, this includes user information, quiz data, and the interaction with the database.

- **View**: Represents the user interface (UI) components and the presentation layer. The Android app's UI is designed to be user-friendly and intuitive for quiz taking and management.

- **ViewModel**: Acts as an intermediary between the Model and the View. It holds and manages the data needed by the View and ensures that the UI remains up-to-date with the underlying data. The ViewModel also handles user interactions and updates the Model accordingly.

The MVVM architecture promotes separation of concerns, making the codebase more maintainable and testable. It also allows for better code organization and reusability.
