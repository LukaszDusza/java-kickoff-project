
drop table planet;
create table if not exists planet (
                                     id int(5) auto_increment primary key unique,
                                     name varchar(20) not null,
                                     distance numeric(30) not null,
                                     description varchar(255) not null,
                                     photo_url varchar(255) not null
);

insert into planet values (1,'Merkury',156000000000,'Temperatura powierzchni waha się od −173 do 427 stopni','https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Mercury_in_true_color.jpg/800px-Mercury_in_true_color.jpg');
insert into planet values (2, 'Wenus', 40000000000, 'najgęstszą atmosferę ze wszystkich planet skalistych', 'https://pl.wikipedia.org/wiki/Wenus#/media/Plik:Venus-real_color.jpg');
insert into planet values (3, 'Mars', 54000000000, 'czerwona planeta', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Mars_Valles_Marineris.jpeg/800px-Mars_Valles_Marineris.jpeg');
insert into planet values (4,'Jowisz',626000000000,'największa planeta Układu Słonecznego','https://pl.wikipedia.org/wiki/Jowisz#/media/Plik:Jupiter_and_its_shrunken_Great_Red_Spot_(cropped).jpg');
insert into planet values (5,'Saturn',1250400000000,'planeta z największą liczbą księżyców','https://pl.wikipedia.org/wiki/Saturn#/media/Plik:Saturn_during_Equinox_(cropped).jpg');
insert into planet values (6,'Uran',2721400000000,'pierwsza planeta odkryta przy pomocy teleskopu','https://pl.wikipedia.org/wiki/Uran#/media/Plik:Uranus2_(cropped)-1.jpg');
insert into planet values (7,'Neptun',4347000000000,'składa się głównie z wodoru i helu','https://pl.wikipedia.org/wiki/Neptun#/media/Plik:Neptune_-_Voyager_2_(29347980845)_flatten_crop.jpg');


