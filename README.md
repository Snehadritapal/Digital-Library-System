# Digital Library Management System

## Overview
The Digital Library Management System is a console-based Java application that allows librarians to manage books efficiently. Users can add, update, search, view, and delete book records, while ensuring all data is stored within the application during runtime.

## Features
- Add a new book with Book ID, Title, Author, Genre, and Availability Status
- View all books in the library
- Search for a book by its ID or Title
- Update book details including status, title, author, and genre
- Delete a book using its ID

## Prerequisites
Make sure you have the following installed:
- Java Development Kit (JDK) 8 or higher
- Git (for version control)

## Setup Instructions

1. **Clone the Repository**
```bash
git clone https://github.com/your-username/Digital-Library-Management.git
cd Digital-Library-Management
```

2. **Compile the Code**
```bash
javac LibraryManagementSystem.java
```

3. **Run the Application**
```bash
java LibraryManagementSystem
```

## Usage
1. Choose from the menu options displayed.
2. Provide the required inputs (e.g., Book ID, Title, Author, etc.).
3. Follow the on-screen instructions for actions like adding, updating, or deleting books.

## Example
```
Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 1
Enter Book ID: 1
Enter Title: abc
Enter Author: def
Enter Genre: romance 
Enter Availability (Available/Checked Out): available
Book added successfully!

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 1
Enter Book ID: 2
Enter Title: ghi
Enter Author: jkl
Enter Genre: thriller
Enter Availability (Available/Checked Out): available
Book added successfully!

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 1
Enter Book ID: 3
Enter Title:
Title cannot be empty. Please enter a valid title.
Enter Title: mno
Enter Author:
Author cannot be empty. Please enter a valid author.
Enter Author: pqr
Enter Genre: horror
Enter Availability (Available/Checked Out): available
Book added successfully!

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 2
Book ID: 1, Title: abc, Author: def, Genre: romance, Status: available
Book ID: 2, Title: ghi, Author: jkl, Genre: thriller, Status: available
Book ID: 3, Title: mno, Author: pqr, Genre: horror, Status: available

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 3
Enter Book ID or Title to search: 1
Book ID: 1, Title: abc, Author: def, Genre: romance, Status: available

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 3
Enter Book ID or Title to search: ghi
Book ID: 2, Title: ghi, Author: jkl, Genre: thriller, Status: available

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 4
Enter Book ID to update: 3
Enter new Title (leave empty to keep current): rty
Enter new Author (leave empty to keep current): yui
Enter new Genre (leave empty to keep current):
Enter new Status (Available/Checked Out): available
Book updated successfully!

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 2
Book ID: 1, Title: abc, Author: def, Genre: romance, Status: available
Book ID: 2, Title: ghi, Author: jkl, Genre: thriller, Status: available
Book ID: 3, Title: rty, Author: yui, Genre: horror, Status: available

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 4
Enter Book ID to update: 1
Enter new Title (leave empty to keep current):
Enter new Author (leave empty to keep current):
Enter new Genre (leave empty to keep current):
Enter new Status (Available/Checked Out): checked out
Book updated successfully!

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 2
Book ID: 1, Title: abc, Author: def, Genre: romance, Status: checked out
Book ID: 2, Title: ghi, Author: jkl, Genre: thriller, Status: available
Book ID: 3, Title: rty, Author: yui, Genre: horror, Status: available

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 5
Enter Book ID to delete: 3
Book deleted successfully.

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 2
Book ID: 1, Title: abc, Author: def, Genre: romance, Status: checked out
Book ID: 2, Title: ghi, Author: jkl, Genre: thriller, Status: available

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 5
Enter Book ID to delete: 1
Book deleted successfully.

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 2
Book ID: 2, Title: ghi, Author: jkl, Genre: thriller, Status: available

Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Details
5. Delete Book
6. Exit
Choose an option: 6
Exiting... Goodbye!
```

## Assumptions
- Book IDs are unique.
- Titles and authors cannot be empty.
- Availability status is either `Available` or `Checked Out`.

## Challenges and Improvements
- **Challenges:** Implementing input validation and managing dynamic data within a console application.
- **Future Improvements:**
  - Add file storage or database connectivity for persistence.
  - Implement user authentication.
  - Provide a graphical user interface.

## Contributing
Feel free to fork this repository and submit pull requests for enhancements!

## License
This project is licensed under the MIT License. For more details, see the LICENSE file.

