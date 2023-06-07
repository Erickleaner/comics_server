create table catalog
(
    catalog_id int auto_increment
        primary key,
    `order`    int         null,
    title      varchar(50) null
);

INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (1, 1, '第一章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (2, 2, '第二章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (3, 3, '第三章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (4, 4, '第四章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (5, 5, '第五章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (6, 6, '第六章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (7, 7, '第七章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (8, 8, '第八章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (9, 9, '第九章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (10, 10, '第十章');
INSERT INTO comics.catalog (catalog_id, `order`, title) VALUES (11, 11, '第十一章');
