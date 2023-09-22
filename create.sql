
    create table contents (
        id integer not null auto_increment,
        tutorial_id integer,
        type_of_content varchar(64) not null,
        content_description varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table emails (
        id integer not null auto_increment,
        user_id integer,
        email_address varchar(32) not null,
        tipology varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table phones (
        id integer not null auto_increment,
        nation_code varchar(4) not null,
        user_id integer,
        type_of_number varchar(16) not null,
        phone_number varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tutorials (
        id integer not null auto_increment,
        url_id integer,
        user_id integer,
        tutorial_created_at datetime(6) not null,
        tutorial_subtitle varchar(255) not null,
        tutorial_theme varchar(255) not null,
        tutorial_title varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table urls (
        id integer not null auto_increment,
        type_of_url varchar(255),
        url_path varchar(255) not null,
        primary key (id)
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

    alter table emails 
       add constraint UK_4jeq4kcq8fkfq1jhb5qp2mqj1 unique (email_address);

    alter table phones 
       add constraint UK79726hiokk53sjhk9glc1cg23 unique (phone_number, nation_code);

    alter table tutorials 
       add constraint UK6ou6uxl3c3upi225ggslwonj3 unique (tutorial_title, tutorial_subtitle);

    alter table tutorials 
       add constraint UK_g0vss4c7tpn1wshqevppmc9yj unique (url_id);

    alter table tutorials 
       add constraint UK_1iwqjqcufxj8vrjmuywff58d7 unique (user_id);

    alter table urls 
       add constraint UK_im1o7l3eknmw16p5as552w84e unique (url_path);

    alter table users 
       add constraint UKer8xab3pe0ea0u5wylpj5l3wn unique (user_name, user_surname);

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
       add constraint FK4p971uglr67j7hstqblc5hb2j 
       foreign key (url_id) 
       references urls (id);

    alter table tutorials 
       add constraint FKhxjckit58h68yl9ysd84vyf0y 
       foreign key (user_id) 
       references users (id);

    create table contents (
        id integer not null auto_increment,
        tutorial_id integer,
        type_of_content varchar(64) not null,
        content_description varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table emails (
        id integer not null auto_increment,
        user_id integer,
        email_address varchar(32) not null,
        tipology varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table phones (
        id integer not null auto_increment,
        nation_code varchar(4) not null,
        user_id integer,
        type_of_number varchar(16) not null,
        phone_number varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tutorials (
        id integer not null auto_increment,
        url_id integer,
        user_id integer,
        tutorial_created_at datetime(6) not null,
        tutorial_subtitle varchar(255) not null,
        tutorial_theme varchar(255) not null,
        tutorial_title varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table urls (
        id integer not null auto_increment,
        type_of_url varchar(255),
        url_path varchar(255) not null,
        primary key (id)
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

    alter table emails 
       add constraint UK_4jeq4kcq8fkfq1jhb5qp2mqj1 unique (email_address);

    alter table phones 
       add constraint UK79726hiokk53sjhk9glc1cg23 unique (phone_number, nation_code);

    alter table tutorials 
       add constraint UK6ou6uxl3c3upi225ggslwonj3 unique (tutorial_title, tutorial_subtitle);

    alter table tutorials 
       add constraint UK_g0vss4c7tpn1wshqevppmc9yj unique (url_id);

    alter table tutorials 
       add constraint UK_1iwqjqcufxj8vrjmuywff58d7 unique (user_id);

    alter table urls 
       add constraint UK_im1o7l3eknmw16p5as552w84e unique (url_path);

    alter table users 
       add constraint UKer8xab3pe0ea0u5wylpj5l3wn unique (user_name, user_surname);

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
       add constraint FK4p971uglr67j7hstqblc5hb2j 
       foreign key (url_id) 
       references urls (id);

    alter table tutorials 
       add constraint FKhxjckit58h68yl9ysd84vyf0y 
       foreign key (user_id) 
       references users (id);

    create table contents (
        id integer not null auto_increment,
        tutorial_id integer,
        type_of_content varchar(64) not null,
        content_description varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table emails (
        id integer not null auto_increment,
        user_id integer,
        email_address varchar(32) not null,
        tipology varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table phones (
        id integer not null auto_increment,
        nation_code varchar(4) not null,
        user_id integer,
        type_of_number varchar(16) not null,
        phone_number varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tutorials (
        id integer not null auto_increment,
        url_id integer,
        user_id integer,
        tutorial_created_at datetime(6) not null,
        tutorial_subtitle varchar(255) not null,
        tutorial_theme varchar(255) not null,
        tutorial_title varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table urls (
        id integer not null auto_increment,
        type_of_url varchar(255),
        url_path varchar(255) not null,
        primary key (id)
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

    alter table emails 
       add constraint UK_4jeq4kcq8fkfq1jhb5qp2mqj1 unique (email_address);

    alter table phones 
       add constraint UK79726hiokk53sjhk9glc1cg23 unique (phone_number, nation_code);

    alter table tutorials 
       add constraint UK6ou6uxl3c3upi225ggslwonj3 unique (tutorial_title, tutorial_subtitle);

    alter table tutorials 
       add constraint UK_g0vss4c7tpn1wshqevppmc9yj unique (url_id);

    alter table tutorials 
       add constraint UK_1iwqjqcufxj8vrjmuywff58d7 unique (user_id);

    alter table urls 
       add constraint UK_im1o7l3eknmw16p5as552w84e unique (url_path);

    alter table users 
       add constraint UKer8xab3pe0ea0u5wylpj5l3wn unique (user_name, user_surname);

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
       add constraint FK4p971uglr67j7hstqblc5hb2j 
       foreign key (url_id) 
       references urls (id);

    alter table tutorials 
       add constraint FKhxjckit58h68yl9ysd84vyf0y 
       foreign key (user_id) 
       references users (id);

    create table contents (
        id integer not null auto_increment,
        tutorial_id integer,
        type_of_content varchar(64) not null,
        content_description varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table emails (
        id integer not null auto_increment,
        user_id integer,
        email_address varchar(32) not null,
        tipology varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table phones (
        id integer not null auto_increment,
        nation_code varchar(4) not null,
        user_id integer,
        type_of_number varchar(16) not null,
        phone_number varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tutorials (
        id integer not null auto_increment,
        url_id integer,
        user_id integer,
        tutorial_created_at datetime(6) not null,
        tutorial_subtitle varchar(255) not null,
        tutorial_theme varchar(255) not null,
        tutorial_title varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table urls (
        id integer not null auto_increment,
        type_of_url varchar(255),
        url_path varchar(255) not null,
        primary key (id)
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

    alter table emails 
       add constraint UK_4jeq4kcq8fkfq1jhb5qp2mqj1 unique (email_address);

    alter table phones 
       add constraint UK79726hiokk53sjhk9glc1cg23 unique (phone_number, nation_code);

    alter table tutorials 
       add constraint UK6ou6uxl3c3upi225ggslwonj3 unique (tutorial_title, tutorial_subtitle);

    alter table tutorials 
       add constraint UK_g0vss4c7tpn1wshqevppmc9yj unique (url_id);

    alter table tutorials 
       add constraint UK_1iwqjqcufxj8vrjmuywff58d7 unique (user_id);

    alter table urls 
       add constraint UK_im1o7l3eknmw16p5as552w84e unique (url_path);

    alter table users 
       add constraint UKer8xab3pe0ea0u5wylpj5l3wn unique (user_name, user_surname);

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
       add constraint FK4p971uglr67j7hstqblc5hb2j 
       foreign key (url_id) 
       references urls (id);

    alter table tutorials 
       add constraint FKhxjckit58h68yl9ysd84vyf0y 
       foreign key (user_id) 
       references users (id);
