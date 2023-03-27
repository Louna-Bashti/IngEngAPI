INSERT INTO Etudiant VALUES (1, 'louna.bashti@etud.univ-jfc.fr', 'Bashti', 'Louna', 'lbashti', 'xxx');
INSERT INTO Etudiant VALUES (2, 'noemie.lipovac@etud.univ-jfc.fr', 'Lipovac', 'Noemie', 'nlipovac', '123');
INSERT INTO Etudiant VALUES (3, 'rokaya.rezouki@etud.univ-jfc.fr', 'Rezouki', 'rokaya', 'rrezouki', 'toto');
INSERT INTO Etudiant VALUES (4, 'jules.durand@etud.univ-jfc.fr', 'Durand', 'Jules', 'jdurand', 'fdsfds');
INSERT INTO Etudiant VALUES (5, 'jean.dupond@etud.univ-jfc.fr', 'Dupond', 'Jean', 'jdupond', 'hello');
INSERT INTO Etudiant VALUES (6, 'lucie.robert@etud.univ-jfc.fr', 'Robert', 'Lucie', 'lrobert', 'test');

INSERT INTO Type_Activite VALUES (1, 'Climat/Environnement', 'Activités en rapport avec la sensibilisation au climat et à l_engagement d_un ingénieur');
INSERT INTO Type_Activite VALUES (2, 'Associatif', 'Activités en rapport avec l_engagement associatif et la vie étudiante');
INSERT INTO Type_Activite VALUES (3, 'Diversité', 'Activités en rapport avec la promotion de l_égalité des chances et de la diversité au sein d_un établissement scolaire');
INSERT INTO Type_Activite VALUES (4, 'Climat/Environnement', 'Activités en rapport avec la promotion du diplôme ISIS et l_engagement dans la vie de l_école');


INSERT INTO Activite VALUES (1,1,'Fresque du Climat', 'Aide à l_animation de la fresque du climat','0.15-0,25',NULL,FALSE,NULL,1);
INSERT INTO Activite VALUES (2,2,'Concert du MIC', 'Participation au concert du MIC','0.1',TO_DATE(2023/27/03, YYYY/DD/MM),TRUE,NULL,2);
INSERT INTO Activite VALUES (3,1,'Conférence Ingénieur Engagé', 'Préparation de la conférence de monsieur X à la date 27/03/2023','0.3',TO_DATE(2023/20/03, YYYY/DD/MM),TRUE,NULL,1);
INSERT INTO Activite VALUES (4,3,'Cordées de la Réussite', 'Sortie cinéma du 25/04/2023','0.3',NULL,FALSE,NULL,3);
INSERT INTO Activite VALUES (5,4,'Journées portes ouvertes', 'Animation d_un stand','0.2',,TO_DATE(2023/20/01, YYYY/DD/MM),TRUE,NULL,4);


INSERT INTO Promotion VALUES (1, 'FIE 1');
INSERT INTO Promotion VALUES (2, 'FIE 2');
INSERT INTO Promotion VALUES (3, 'FIE 3');
INSERT INTO Promotion VALUES (4, 'FIE 4');
INSERT INTO Promotion VALUES (5, 'FIE 5');
INSERT INTO Promotion VALUES (6, 'FIA 3');
INSERT INTO Promotion VALUES (7, 'FIA 4');
INSERT INTO Promotion VALUES (8, 'FIA 5');

INSERT INTO Inscription VALUES (1, '2022/2023', TO_DATE(2022/20/08, YYYY/DD/MM), 1, 3);
INSERT INTO Inscription VALUES (2, '2021/2022', TO_DATE(2021/20/08, YYYY/DD/MM), 1, 2);
INSERT INTO Inscription VALUES (3, '2020/2021', TO_DATE(2020/20/08, YYYY/DD/MM), 1, 1);
INSERT INTO Inscription VALUES (4, '2022/2023', TO_DATE(2022/20/08, YYYY/DD/MM), 2, 3);
INSERT INTO Inscription VALUES (5, '2022/2023', TO_DATE(2022/20/08, YYYY/DD/MM), 3, 3);
INSERT INTO Inscription VALUES (6, '2022/2023', TO_DATE(2022/20/08, YYYY/DD/MM), 4, 5);
INSERT INTO Inscription VALUES (7, '2022/2023', TO_DATE(2022/20/08, YYYY/DD/MM), 5, 6);
INSERT INTO Inscription VALUES (8, '2022/2023', TO_DATE(2022/20/08, YYYY/DD/MM), 6, 8);

INSERT INTO Personnel VALUES (1, 'Defossez', 'Adrien', 'adrien.defossez@univ-jfc.fr','adefossez','xxx','Directeur des Etudes');
INSERT INTO Personnel VALUES (2, 'Charon', 'Arnaud', 'arnaud.charon@univ-jfc.fr','acharon','888','Référent');
INSERT INTO Personnel VALUES (3, 'Libouroux', 'Sandrine', 'sandrine.libouroux@univ-jfc.fr','slibouroux','666','Scolarité');
INSERT INTO Personnel VALUES (4, 'Lamine', 'Elyès', 'elyes.lamine@univ-jfc.fr','elamine','696','Référent');
INSERT INTO Personnel VALUES (5, 'Faux', 'FRancis', 'francis.faux@univ-jfc.fr','ffaux','555','référent');

INSERT INTO Semestre VALUES (1, 'FIE 1', 'Semestre 1');
INSERT INTO Semestre VALUES (2, 'FIE 1', 'Semestre 2');
INSERT INTO Semestre VALUES (3, 'FIE 2', 'Semestre 3');
INSERT INTO Semestre VALUES (4, 'FIE 2', 'Semestre 4');
INSERT INTO Semestre VALUES (5, 'FIE 3', 'Semestre 5');
INSERT INTO Semestre VALUES (6, 'FIE 3', 'Semestre 6');
INSERT INTO Semestre VALUES (7, 'FIE 4', 'Semestre 7');
INSERT INTO Semestre VALUES (8, 'FIE 4', 'Semestre 8');
INSERT INTO Semestre VALUES (9, 'FIE 5', 'Semestre 9');
INSERT INTO Semestre VALUES (10, 'FIA 3', 'Semestre 5');
INSERT INTO Semestre VALUES (11, 'FIA 3', 'Semestre 6');
INSERT INTO Semestre VALUES (12, 'FIA 4', 'Semestre 7');
INSERT INTO Semestre VALUES (13, 'FIA 4', 'Semestre 8');
INSERT INTO Semestre VALUES (14, 'FIA 5', 'Semestre 9');

INSERT INTO Ue VALUES (1, 1, 'Mathématiques et algorithmique','Analyse, algébre et algorithmique',1,1);
INSERT INTO Ue VALUES (2, 2, 'Mathématiques','Analyse, algébre',2,1);
INSERT INTO Ue VALUES (3, 3, 'Mathématiques','Analyse, algébre et analyse vectorielle',3,2) ;
INSERT INTO Ue VALUES (4, 4, 'Initiation au projet de programmation','Projet agenda',4,2) ;
INSERT INTO Ue VALUES (5, 5, 'Langues et sport',NULL,5,3) ;
INSERT INTO Ue VALUES (6, 6, 'Technologies Web',NULL,6,3) ;
INSERT INTO Ue VALUES (7, 7, 'IoT',NULL,7,4) ;
INSERT INTO Ue VALUES (8, 8, 'Projet tutoré',NULL,8,4) ;
INSERT INTO Ue VALUES (9, 9, 'Sécurité',NULL,9,5) ;
INSERT INTO Ue VALUES (10, 10, 'Langues',NULL,10,6) ;
INSERT INTO Ue VALUES (11, 11, 'Economie',NULL,11,6) ;
INSERT INTO Ue VALUES (12, 12, 'Programmation',NULL,12,7) ;
INSERT INTO Ue VALUES (13, 13, 'Projet',NULL,13,7) ;
INSERT INTO Ue VALUES (14, 14, 'Communication',NULL,14,8) ;

INSERT INTO Choix UE VALUES (1,TO_DATE(23/03/2023, DD/MM/YYYY),6,1);
INSERT INTO Choix UE VALUES (2,TO_DATE(23/03/2022, DD/MM/YYYY),4,1);
INSERT INTO Choix UE VALUES (3,TO_DATE(23/03/2023, DD/MM/YYYY),12,5);
INSERT INTO Choix UE VALUES (4,TO_DATE(23/03/2023, DD/MM/YYYY),6,2);

INSERT INTO Realisation VALUES (1, TO_DATE(20/02/2023, DD/MM/YYYY),'Aide à la fresque du Climat','Francis Faux',TRUE,'Activité bien effectuée, animation efficace',1,6,2);
INSERT INTO Realisation VALUES (2, TO_DATE(20/02/2023, DD/MM/YYYY),'Aide à la fresque du Climat','Francis Faux',FALSE,NULL,1,6,1);
INSERT INTO Realisation VALUES (3, TO_DATE(10/03/2023, DD/MM/YYYY),'Concert du MIC',NULL,TRUE,NULL,1,12,5);
INSERT INTO Realisation VALUES (4, TO_DATE(22/01/2023, DD/MM/YYYY),'Cordées de la Réussite','Arnaud Charon',TRUE,'Activité bien effectuée',1,6,3);
