import os

class MoviesCatalog:

    file_path = 'movies.txt'

    @classmethod
    def add_movie(cls, movie):
        with open(cls.file_path, 'a', encoding='utf8') as file:
            file.write(f'{movie.name}\n')

    @classmethod
    def list_movies(cls):
        with open(cls.file_path, 'r', encoding='utf8') as file:
            print(f'Movies'.center(50, '*'))
            print(file.read())

    @classmethod
    def removeMovies(cls):
        os.remove(cls.file_path)
        print(f'Removed movies: {cls.file_path}')