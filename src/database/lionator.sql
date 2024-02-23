-- Create database if doesn't exist
-- CREATE DATABASE lionator;
-- DROP tables if they exist
DROP TABLE IF EXISTS unit, ranged_weapon, melee_weapon, ability;

CREATE TABLE unit (
    unit_id serial,
    name varchar(80) NOT NULL,
    movement integer,
    toughness integer NOT NULL,
    save integer NOT NULL,
    wounds integer NOT NULL,
    leadership integer NOT NULL,
    objective_control integer NOT NULL,
    invulnerable_save integer,
    warlord boolean,
    CONSTRAINT pk_unit_unit_id PRIMARY KEY (unit_id)
);

CREATE TABLE ranged_weapon (
    ranged_weapon_id serial,
    name varchar(80) NOT NULL,
    range integer NOT NULL,
    attacks varchar(3) NOT NULL,
    ballistic_skill integer NOT NULL,
    strength integer NOT NULL,
    armour_penetration integer NOT NULL,
    damage integer NOT NULL,
    ability integer,
    CONSTRAINT pk_ranged_weapon_ranged_weapon_id PRIMARY KEY (ranged_weapon_id)
);

CREATE TABLE melee_weapon (
    melee_weapon_id serial,
    name varchar(80) NOT NULL,
    range integer NOT NULL,
    attacks varchar(3) NOT NULL,
    weapon_skill integer NOT NULL,
    strength integer NOT NULL,
    armour_penetration integer NOT NULL,
    damage integer NOT NULL,
    ability integer,
    CONSTRAINT pk_melee_weapon_melee_weapon_id PRIMARY KEY(melee_weapon_id)
);

CREATE TABLE ability (
    ability_id serial,
    name varchar(80) NOT NULL,
    CONSTRAINT pk_ability_ability_id PRIMARY KEY (ability_id)
)

INSERT INTO unit (name, movement, toughness, save, wounds, leadership, objective_control, invulnerable_save, warlord)
VALUES ('Lion El''Jonson', 8, 9, 2, 10, 5, 4, 3, true);

INSERT INTO ranged_weapon (name, range, attacks, ballistic_skill, strength, armour_penetration, damage, ability)
VALUES ('Arma Luminus (bolt)',12, 4, 2, 4, -1, 2, 1);

INSERT INTO ability (name)
VALUES ('Pistol');




-- Create tables

