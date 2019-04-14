insert into users(email, enabled, password, fullname)
values('joe@doe.com', true, 'joepass', 'Joe Doe');
insert into users(email, enabled, password, fullname)
values('jane@doe.com', false, 'janepass', 'Jane Doe');
insert into users(email, enabled, password, fullname)
values('king@kong.com', true, 'kingkongpass', 'King Kong');

insert into roles(role) values ('GLOBAL_ADMIN');
insert into roles(role) values ('LOGGED_IN_USER');
insert into roles(role) values ('NOT_LOGGED_IN_USER');
insert into roles(role) values ('ADMIN');

insert into counties(county_name) values ('Békés megye');
insert into counties(county_name) values ('Csongrád megye');
insert into counties(county_name) values ('Zala megye');

insert into manufacturers(manufacturer_name) values ('MTZ');
insert into manufacturers(manufacturer_name) values ('Zetor');
insert into manufacturers(manufacturer_name) values ('John Deere');
insert into manufacturers(manufacturer_name) values ('New Holland');
insert into manufacturers(manufacturer_name) values ('Yto');

insert into categories(category_name) values ('Tractor');
insert into categories(category_name) values ('Tyre');
insert into categories(category_name) values ('Cultivator');
insert into categories(category_name) values ('Other');

insert into ads (title, price, horse_power, sell_or_search, year_of_manufact, category_id, user_id, county_id, number_of_visitors)
values ('Ad1', 20, 150, true, 1980, 1, 1, 1, 0);
insert into ads (title, price, horse_power, sell_or_search, year_of_manufact, category_id, user_id, county_id, number_of_visitors)
values ('Ad2', 25, 150, true, 1980, 1, 1, 1, 0);
insert into ads (title, price, horse_power, sell_or_search, year_of_manufact, category_id, user_id, county_id, number_of_visitors)
values ('Ad3', 35, 150, true, 1980, 1, 2, 1, 0);
insert into ads (title, price, horse_power, sell_or_search, year_of_manufact, category_id, user_id, county_id, number_of_visitors)
values ('Ad4', 30, 3, false, 2019, 2, 3, 2, 0);
insert into ads (title, price, horse_power, sell_or_search, year_of_manufact, category_id, user_id, county_id, number_of_visitors)
values ('Ad5', 220, 1150, true, 1994, 3, 3, 3, 0);