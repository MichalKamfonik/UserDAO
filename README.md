# UserDAO
Simple Data Access Object implementation for entity describing users

## What for?
This class is used as a layer between java implementation of business layer and MySQL Database.

## How does the entity look like?
This DAO class is used for entity consisting of following fields / columns :
* User
  * id
  * name
  * email
  * password

## What are the abilities of this DAO class?
With UserDAO you are able to use CRUD methods:
1. Create user for given entity
1. Read user with given ID
1. Read all users
1. Update user with given entity
1. Delete user with given ID
1. Delete all users

## What technologies were used?
* JDBC
* MySQL
* JBCrypt