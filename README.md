# IN0980 - Teste de Software e Depuração (Tópicos Avançados em Engenharia de Software 3)

## Edição 2020.2

## [Centro de Informática](http://www.cin.ufpe.br/), ([UFPE](http://www.ufpe.br/))

### Professores
* Breno Miranda ([@brenomiranda](https://github.com/brenomiranda) — bafm@cin)
* Leopoldo Teixeira ([@leopoldomt](https://github.com/leopoldomt) — lmt@cin)
  
### Horário e Local de Aulas Síncronas
Terças (8-10h) e Quintas (10-12h), Google Meet

### Recursos
* [Google Classroom](https://classroom.google.com/)

### Ementa
A ementa da parte téorica inclui os seguintes tópicos:
* conceitos básicos sobre teste e depuração de software
* o caso de teste
  * entrada, asserção, test harness (setup, teardown)
  * demosntração com JUnit
* controle de versão e testes
  * demonstração integração contínua com Travis
* critérios de adequação
  * estrutural, lógico, baseado em fluxo de dados, e baseado em erros
* teste funcional
  * particionamento de domínio
  * análise de fronteira
  * seleção de amostras (teste combinatorial)
  
### Bibliografia Sugerida
Não há livro texto obrigatório. Entretanto, a seguir estão alguns materiais recomendados:

#### Livros
* [Generating Software Tests: Breaking Software for Fun and Profit](https://www.fuzzingbook.org/). Andreas Zeller, Rahul Gopinath, Marcel Böhme, Gordon Fraser, and Christian Holler **(online)**
* Software Testing and Analysis. Mauro Pezze and Michal Young, Wiley, 2008
* Why Programs Fail?. Andreas Zeller, Morgan Kaufmann 2009 (2nd edition)
* Software Testing. Glenford Myers, Wiley, 2004 (2nd edition)

#### Podcasts
* [RBCS Software Testing Podcast](https://rbcs-us.com/resources/podcast/)
* [Quality Sense Podcast](https://soundcloud.com/qualitysensepodcast)

#### Sites
* [Google Testing Blog](https://testing.googleblog.com/)

### Plano de Ensino
**Atenção!** *Este plano de ensino está sujeito a alterações durante o semestre, visite frequentemente a página para obter a versão mais atualizada, ou acompanhe os updates no repositório.*

\# | Data | Assunto
-- | ---- | -------
01	|	12/11/2020 (Thu)	|	Apresentação da disciplina, visão geral, admin
02	|	17/11/2020 (Tue)	|	Definições: Falta versus falha, Teste versus depuração, e os vários tipos de teste.
03	|	19/11/2020 (Thu)	|	Conceitos básicos, Framework de testes. Demo: JUnit
04	|	24/11/2020 (Tue)	|	**Discussão de trabalhos** <br />(Líder: **Professores**)<br /><br /> *Antonia Bertolino*. 2007. **Software Testing Research: Achievements, Challenges, Dreams**. In *Future of Software Engineering (FOSE '07)*, Minneapolis, MN, 2007, pp. 85-103, DOI: https://doi.org/10.1109/FOSE.2007.25.  <br /><br /> *Alessandro Orso and Gregg Rothermel*. 2014. **Software testing: a research travelogue (2000–2014)**. In *Future of Software Engineering Proceedings (FOSE 2014)*. Association for Computing Machinery, New York, NY, USA, 117–132. DOI: https://doi.org/10.1145/2593882.2593885
05	|	26/11/2020 (Thu)	|	Test Techniques and Adequacy
06	|	1/12/2020 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Rotsen**)<br /><br />*Zhu, Hong, Patrick AV Hall, John HR May*. **Software unit test coverage and adequacy**. ACM Computing Surveys (CSUR) 29, no. 4 (1997): 366-427.
07	|	3/12/2020 (Thu)	|	Tools for test coverage (Python & Java) + Build Systems (Gradle)
08	|	8/12/2020 (Tue)	|	**Feriado Municipal --- Nossa Senhora da Conceição** 
09	|	10/12/2020 (Thu)	|	Mutation testing
10	|	15/12/2020 (Tue)	|	**Discussão de trabalhos**<br />(Líder: ???)<br /><br />*Mike Papadakis, Marinos Kintis, Jie Zhang, Yue Jia, Yves Le Traon, Mark Harman*. **Chapter Six - Mutation Testing Advances: An Analysis and Survey**, Editor(s): Atif M. Memon, *Advances in Computers*, Elsevier, Volume 112, 2019, Pages 275-378, ISSN 0065-2458, ISBN 9780128151211, DOI: https://doi.org/10.1016/bs.adcom.2018.03.015.
11	|	17/12/2020 (Thu)	|	**ACOMPANHAMENTO DE PROJETO**
\-	|	\-	|	Recesso
12	|	19/01/2021 (Tue)	|	TBD
13	|	21/01/2021 (Thu)	|	Combinatorial Testing
14	|	26/01/2021 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Vinicius**)<br /><br />*Changhai Nie, Hareton Leung*. 2011. **A survey of combinatorial testing**. *ACM Computing Surveys* 43, 2, Article 11 (January 2011), 29 pages. DOI: https://doi.org/10.1145/1883612.1883618
15	|	28/01/2021 (Thu)	|	*Behavior-Driven Development*
16	|	2/02/2021 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Bernardo**)<br /><br />*Mohammad Ghafari, Timm Gross, Davide Fucci, and Michael Felderer*. 2020. **Why Research on Test-Driven Development is Inconclusive?** *Proceedings of the 14th ACM / IEEE International Symposium on Empirical Software Engineering and Measurement (ESEM)*. Association for Computing Machinery, New York, NY, USA, Article 25, 1–10. DOI: https://doi.org/10.1145/3382494.3410687<br /><br />*Adnan Causevic, Daniel Sundmark and Sasikumar Punnekkat*. **Factors Limiting Industrial Adoption of Test Driven Development: A Systematic Review**. *Fourth IEEE International Conference on Software Testing, Verification and Validation*, Berlin, 2011, pp. 337-346, doi: https://doi.org/10.1109/ICST.2011.19.
17	|	4/02/2021 (Thu)	|	UI Testing
18	|	9/02/2021 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Patrick**)<br /><br />*Ishan Banerjee, Bao Nguyen, Vahid Garousi, Atif Memon*. **Graphical user interface (GUI) testing: Systematic mapping and repository**. *Information and Software Technology*, Volume 55, Issue 10, 2013, Pages 1679-1694, ISSN 0950-5849, DOI: https://doi.org/10.1016/j.infsof.2013.03.004.
19	|	11/02/2021 (Thu)	|	Fuzzing
\-	|	16/02/2021 (Tue)	|	**Feriado --- Carnaval**
20	|	18/02/2021 (Thu)	|	TBD
21	|	23/02/2021 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Jairo**)<br /><br />*Valentin Manès, HyungSeok Han, Choongwoo Han, Sang Kil Cha, Manuel Egele, Edward J. Schwartz, Maverick Woo*. **The Art, Science, and Engineering of Fuzzing: A Survey**. Accepted for publication in *IEEE Transactions on Software Engineering*. DOI: https://doi.org/10.1109/TSE.2019.2946563.
22	|	25/02/2021 (Thu)	|	Regression Testing
23	|	2/03/2021 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Davi**)<br /><br />*Shin Yoo, Mark Harman*. **Regression testing minimization, selection and prioritization: a survey**. *Software Testing, Verification and Reliability (STVR)* 22, no. 2 (2012): 67-120. DOI: https://doi.org/10.1002/stv.430.
24	|	4/03/2021 (Thu)	|	Flakiness
25	|	9/03/2021 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Keila**)<br /><br />*Jonathan Bell, Owolabi Legunsen, Michael Hilton, Lamyaa Eloussi, Tifany Yung, Darko Marinov*. **DeFlaker: Automatically detecting flaky tests**. In *IEEE/ACM 40th International Conference on Software Engineering (ICSE'2018)*, pp. 433-444. IEEE, 2018. DOI: https://doi.org/10.1145/3180155.3180164.<br /><br />*Wing Lam, Stefan Winter, Anjiang Wei, Tao Xie, Darko Marinov, Jonathan Bell*. **A large-scale longitudinal study of flaky tests**. *Proc. ACM Program. Lang. 4, OOPSLA*, Article 202 (November 2020), 29 pages. DOI: https://doi.org/10.1145/3428270.
26	|	11/03/2021 (Thu)	|	Machine Learning Testing
27	|	16/03/2021 (Tue)	|	**Discussão de trabalhos**<br />(Líder: **Rodrigo Lima**)<br /><br />*Jie M. Zhang, Mark Harman, Lei Ma, Yang Liu*. **Machine Learning Testing: Survey, Landscapes and Horizons**. Accepted for publication in *IEEE Transactions on Software Engineering*. DOI: https://doi.org/10.1109/TSE.2019.2962027.
28	|	18/03/2021 (Thu)	|	**Discussão de trabalhos**<br />(Líder: **Rodrigo Peixoto**)<br /><br />*Vahid Garousi, Michael Felderer, Çağrı Murat Karapıçak, Uğur Yılmaz*. **Testing embedded software: A survey of the literature**. *Information and Software Technology* 104 (2018): 14-45, https://doi.org/10.1016/j.infsof.2018.06.016. 
29	|	23/03/2021 (Tue)	|	TBD
30	|	25/03/2021 (Thu)	|	TBD
31	|	30/03/2021 (Tue)	|	Apresentações dos projetos
32	|	01/04/2021 (Thu)	|	Apresentações dos projetos

