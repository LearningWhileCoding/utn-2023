from User import User
from DAO_user import DAOuser
from logger_base import log


def get_int_input(prompt):
    try:
        return int(input(prompt))
    except ValueError:
        log.error("Invalid input. Please enter a valid integer.")
        return None


option = None
while option != 5:
    print('Options: ')
    print('1. Display users')
    print('2. Add User')
    print('3. Update user')
    print('4. Delete user')
    print('5. Exit')

    option = get_int_input('Enter an option from 1 to 5: \n')

    if option == 1:
        try:
            users = DAOuser.select()
            for user in users:
                log.info(user)
        except Exception as e:
            log.error(f"An error occurred while displaying users: {e}")

    elif option == 2:
        try:
            username_var = input('Enter the username: ')
            password_var = input('Enter a password: ')
            user = User(username=username_var, password=password_var)
            inserted_user = DAOuser.insert(user)
            log.info(f'Inserted user: {inserted_user}')
        except Exception as e:
            log.error(f"An error occurred while adding a user: {e}")

    elif option == 3:
        try:
            id_user_var = input('Enter the id: ')
            username_var = input('Enter the username: ')
            password_var = input('Enter a password: ')
            user = User(id_user=id_user_var, username=username_var, password=password_var)
            updated_user = DAOuser.update(user)
            log.info(f'Updated user: {updated_user}')
        except Exception as e:
            log.error(f"An error occurred while updating a user: {e}")

    elif option == 4:
        try:
            id_user_var = input('Enter the id: ')
            user = User(id_user=id_user_var)
            deleted_user = DAOuser.delete(user)
            log.info(f'Deleted user: {deleted_user}')
        except Exception as e:
            log.error(f"An error occurred while deleting a user: {e}")

    elif option == 5:
        log.info('Exiting the application')

    else:
        log.error('Invalid option. Please select an option from 1 to 5.')
