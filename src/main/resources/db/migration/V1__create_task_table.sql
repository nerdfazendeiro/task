CREATE TABLE task (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    description TEXT NOT NULL,
    datecreate DATE NOT NULL,
    datefinish DATE NOT NULL,
    priority TEXT NOT NULL,
    status TEXT NOT NULL
);
