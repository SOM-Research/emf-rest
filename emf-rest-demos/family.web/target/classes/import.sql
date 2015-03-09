
insert into users (id,username, password) values (1,'admin','admin')
insert into users (id,username, password) values (2,'user','user')

insert into roles(id,roleName) values (1,'admin')
insert into roles(id,roleName) values(2,'user')


insert into user_role (id,user_id,role_id) values(1,1,1)
insert into user_role (id,user_id,role_id) values(2,1,2)
insert into user_role (id,user_id,role_id) values(3,2,2)