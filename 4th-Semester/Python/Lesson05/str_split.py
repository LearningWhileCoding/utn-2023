# split() method

# Splitting a string into a list of words
courses = 'Java JavaScript Node Python Design'
course_list = courses.split()
print(f'List of courses: {course_list}')
print(type(course_list))

# Splitting a string into a list using a comma as the separator
courses_comma_separated = 'Java,Python,Node,JavaScript,Spring'
course_list = courses_comma_separated.split(',', 2)
print(f'List of courses: {course_list}')
print(len(course_list))
