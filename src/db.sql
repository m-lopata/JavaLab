-- resources/database.sql
CREATE TABLE students (
                          id INTEGER PRIMARY KEY AUTOINCREMENT,
                          last_name TEXT NOT NULL,
                          first_name TEXT NOT NULL,
                          middle_name TEXT NOT NULL,
                          birth_date DATE NOT NULL,
                          record_book_number TEXT NOT NULL
);

INSERT INTO students (last_name, first_name, middle_name, birth_date, record_book_number) VALUES
                                                                                              ('Smirnov', 'Sergey', 'Sergeevich', '2000-04-10', 'RB004'),
                                                                                              ('Popov', 'Pavel', 'Pavlovich', '2000-05-12', 'RB005'),
                                                                                              ('Volkov', 'Vladimir', 'Vladimirovich', '2000-06-14', 'RB006'),
                                                                                              ('Kozlov', 'Konstantin', 'Konstantinovich', '2000-07-16', 'RB007'),
                                                                                              ('Novikov', 'Nikolay', 'Nikolaevich', '2000-08-18', 'RB008'),
                                                                                              ('Morozov', 'Mikhail', 'Mikhailovich', '2000-09-20', 'RB009'),
                                                                                              ('Pavlov', 'Petr', 'Petrovich', '2000-10-22', 'RB010'),
                                                                                              ('Sokolov', 'Stanislav', 'Stanislavovich', '2000-11-24', 'RB011'),
                                                                                              ('Lebedev', 'Leonid', 'Leonidovich', '2000-12-26', 'RB012'),
                                                                                              ('Kuzmin', 'Kirill', 'Kirillovich', '2000-01-28', 'RB013'),
                                                                                              ('Gusev', 'Grigory', 'Grigorievich', '2000-02-01', 'RB014'),
                                                                                              ('Titov', 'Timur', 'Timurovich', '2000-03-03', 'RB015'),
                                                                                              ('Orlov', 'Oleg', 'Olegovich', '2000-04-05', 'RB016'),
                                                                                              ('Belyaev', 'Boris', 'Borisovich', '2000-05-07', 'RB017'),
                                                                                              ('Grigoriev', 'Gleb', 'Glebovich', '2000-06-09', 'RB018'),
                                                                                              ('Krylov', 'Klim', 'Klimovich', '2000-07-11', 'RB019'),
                                                                                              ('Fedorov', 'Fedor', 'Fedorovich', '2000-08-13', 'RB020');                                                                   ('Kuznetsov', 'Kuzma', 'Kuzmich', '2000-12-30', 'RB020');