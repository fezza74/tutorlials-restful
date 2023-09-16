
    alter table contents 
       drop 
       foreign key FK7gwjavj7plqbce9qxoblc6lu6;

    alter table emails 
       drop 
       foreign key FK41wb6kvdemvj1602iltrfr1uo;

    alter table phones 
       drop 
       foreign key FKmg6d77tgqfen7n1g763nvsqe3;

    alter table tutorials 
       drop 
       foreign key FKhxjckit58h68yl9ysd84vyf0y;

    alter table urls 
       drop 
       foreign key FK31nbxw9e1inas1lmdkwxqv10;

    drop table if exists contents;

    drop table if exists emails;

    drop table if exists phones;

    drop table if exists tutorials;

    drop table if exists urls;

    drop table if exists users;
