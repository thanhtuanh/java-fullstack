-- Bestehende Daten löschen
DELETE FROM books;

-- Neue Testdaten einfügen
INSERT INTO books (title, author, isbn, description, publication_date, price, pages, genre, in_stock) VALUES
('Der Prozess', 'Franz Kafka', '9780000000001', 'Ein Mann wird grundlos verhaftet.', '1925-04-26', 9.95, 237, 'Klassische Literatur', FALSE),
('Clean Code', 'Robert C. Martin', '9780000000002', 'Ein Handbuch für sauberen Code.', '2008-08-01', 39.99, 464, 'Informatik', TRUE),
('Spring in Action', 'Craig Walls', '9780000000003', 'Spring Framework in der Praxis.', '2018-11-27', 44.90, 520, 'Informatik', TRUE),
('1984', 'George Orwell', '9780000000004', 'Dystopischer Roman über Überwachung.', '1949-06-08', 8.99, 328, 'Roman', TRUE),
('Die Verwandlung', 'Franz Kafka', '9780000000005', 'Ein Mann wacht als Käfer auf.', '1915-01-01', 7.99, 100, 'Klassische Literatur', TRUE),
('Angular für Einsteiger', 'Max Mustermann', '9780000000006', 'Einführung in Angular.', '2022-05-15', 29.99, 350, 'Informatik', TRUE),
('Java für Profis', 'Erika Beispiel', '9780000000007', 'Fortgeschrittene Java-Konzepte.', '2021-10-01', 49.90, 600, 'Informatik', TRUE),
('Der Alchimist', 'Paulo Coelho', '9780000000008', 'Philosophischer Roman über Träume.', '1988-04-15', 10.99, 190, 'Roman', TRUE),
('Siddhartha', 'Hermann Hesse', '9780000000009', 'Eine indische Dichtung.', '1922-01-01', 9.50, 152, 'Spiritualität', TRUE),
('Effektives Arbeiten', 'Lisa Produktiv', '9780000000010', 'Tipps für produktives Arbeiten.', '2020-01-01', 19.95, 210, 'Ratgeber', TRUE);
