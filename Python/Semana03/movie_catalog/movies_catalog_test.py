from domain.Movie import Movie
from service.movies_catalog import MoviesCatalog as mc

option = None
while option != 4:
    try:
        print('Menu')
        print('1. Add a movie')
        print('2. Show movies')
        print('3. Remove all movies')
        print('4. Exit')
        option = int(input('Enter an option 1-4:'))
        if option == 1:
            movie_name = input('Enter the movie title: ')
            movie = Movie(movie_name)
            mc.add_movie(movie)
        elif option == 2:
            mc.list_movies()
        elif option == 3:
            mc.removeMovies()

    except Exception as e:
        print(f'There was an error: {e}')
        option = None
    else:
        print('Execution finished!')
