    create table contents (
        id integer not null auto_increment,
        tutorial_id integer,
        type_of_content varchar(64) not null,
        content_description varchar(256) not null,
        primary key (id)
    ) engine=InnoDB;

    create table emails (
        user_id integer,
        email_address varchar(32) not null,
        tipology varchar(255),
        primary key (email_address)
    ) engine=InnoDB;

    create table phones (
        nation_code varchar(4) not null,
        phone_number integer not null,
        user_id integer,
        type_of_number varchar(16) not null,
        primary key (phone_number)
    ) engine=InnoDB;

    create table tutorials (
        id integer not null auto_increment,
        user_id integer,
        tutorial_created_at datetime(6) not null,
        tutorial_name varchar(512) not null,
        tutorial_subtitle varchar(512) not null,
        tutorial_title varchar(512) not null,
        primary key (id)
    ) engine=InnoDB;

    create table urls (
        user_id integer,
        url_address varchar(255) not null,
        url_description varchar(255),
        primary key (url_address)
    ) engine=InnoDB;

    create table users (
        id integer not null auto_increment,
        user_code varchar(16) not null,
        user_name varchar(32),
        user_surname varchar(32),
        primary key (id)
    ) engine=InnoDB;

    alter table contents 
       add constraint UKg6qnyhqyy2rap7b5acspw3twx unique (type_of_content, content_description);

    alter table tutorials 
       add constraint UK_gr8v5keo73uvo6lkwlataqw89 unique (tutorial_title);

    alter table users 
       add constraint UK_t4oh2dnaf9b4jc7qj8rxswgyh unique (user_code);

    alter table contents 
       add constraint FK7gwjavj7plqbce9qxoblc6lu6 
       foreign key (tutorial_id) 
       references tutorials (id);

    alter table emails 
       add constraint FK41wb6kvdemvj1602iltrfr1uo 
       foreign key (user_id) 
       references users (id);

    alter table phones 
       add constraint FKmg6d77tgqfen7n1g763nvsqe3 
       foreign key (user_id) 
       references users (id);

    alter table tutorials 
       add constraint FKhxjckit58h68yl9ysd84vyf0y 
       foreign key (user_id) 
       references users (id);

    alter table urls 
       add constraint FK31nbxw9e1inas1lmdkwxqv10 
       foreign key (user_id) 
       references users (id);
