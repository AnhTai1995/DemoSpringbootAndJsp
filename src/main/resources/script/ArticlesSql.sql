DROP TABLE IF EXISTS "articles";
CREATE TABLE "articles"(
   article_id serial PRIMARY KEY,
   title VARCHAR (200) NOT NULL,
     category VARCHAR (100) NOT NULL
);

-- ----------------------------
-- Records of "articles"
-- ----------------------------
INSERT INTO "articles" VALUES (1, 'Java Concurrency', 'Java');
INSERT INTO "articles" VALUES (2, 'Hibernate HQL ', 'Hibernate');
INSERT INTO "articles" VALUES (3, 'Spring MVC with Hibernate', 'Spring');
INSERT INTO "articles" VALUES (10, '1', 'test');
INSERT INTO "articles" VALUES (11, '1', 'test');
INSERT INTO "articles" VALUES (12, 'Java Concurrency 1', 'Java');
INSERT INTO "articles" VALUES (13, 'Hibernate HQL  1', 'Hibernate');
INSERT INTO "articles" VALUES (14, 'Spring MVC with Hibernate 1', 'Spring');
INSERT INTO "articles" VALUES (15, 'Java Concurrency 2', 'Java');