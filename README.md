# IN0980 - Teste de Software e Depuração (Tópicos Avançados em Engenharia de Software 3)

## Edição 2021.1

## [Centro de Informática](http://www.cin.ufpe.br/), ([UFPE](http://www.ufpe.br/))

### Professor
* Breno Miranda ([@brenomiranda](https://github.com/brenomiranda) — bafm@cin)
  
### Horário e Local de Aulas Síncronas
Terças (10-12h) e Quintas (08-10h), Google Meet

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
01 |	06/05/2021 (Thu)	|	Apresentação da disciplina, visão geral, admin
02 |	11/05/2021 (Tue)	|	Definições: Falta versus falha, Teste versus depuração, e os vários tipos de teste.
03 |	13/05/2021 (Thu)	|	Conceitos básicos
04 |	18/05/2021 (Tue)	|	**Discussão de trabalhos** <br />(Líder: **Professor**)<br /><br /> *Mary Jean Harrold*. 2000. [**Testing: A Roadmap**](https://doi.org/10.1145/336512.336532). In *Conference on The Future of Software Engineering (FOSE'00 @ ICSE'00)*. Association for Computing Machinery, New York, NY, USA, 61–72. DOI: [https://doi.org/10.1145/336512.336532](https://doi.org/10.1145/336512.336532).
05 |	20/05/2021 (Thu)	|	**Sem aula --- AST'21 @ ICSE'21**
06 |	25/05/2021 (Tue)	|	**Discussão de trabalhos** <br /> Apresentador(a): **Aline** - Historiador(a): **Diogenes** - Revisor(a): **Emerson** - Pesquisador(a): **Lucas** <br /><br /> *Antonia Bertolino*. 2007. [**Software Testing Research: Achievements, Challenges, Dreams**](https://doi.org/10.1109/FOSE.2007.25). In *Future of Software Engineering (FOSE '07)*, Minneapolis, MN, 2007, pp. 85-103, DOI: [https://doi.org/10.1109/FOSE.2007.25](https://doi.org/10.1109/FOSE.2007.25).
07 |	27/06/2021 (Thu)	|	Framework de testes. Demo: Pytest/JUnit
08 |	01/06/2021 (Tue)	|	**Discussão de trabalhos** <br /> Apresentador(a): **Raquel** - Historiador(a): **Reydne** - Revisor(a): **Thayonara** - Pesquisador(a): **Vitor** <br /><br /> *Alessandro Orso and Gregg Rothermel*. 2014. [**Software testing: a research travelogue (2000–2014)**](https://doi.org/10.1145/2593882.2593885). In *Future of Software Engineering Proceedings (FOSE 2014)*. Association for Computing Machinery, New York, NY, USA, 117–132. DOI: [https://doi.org/10.1145/2593882.2593885](https://doi.org/10.1145/2593882.2593885).
09 |	03/06/2021 (Thu)	|	**ACOMPANHAMENTO DE PROJETO**
10 |	08/06/2021 (Tue)  | Testing techniques + Adequacy
11 |	10/06/2021 (Thu)	|	**Discussão de trabalhos** <br /> Apresentador(a): **Lucas** - Historiador(a): **Aline** - Revisor(a): **Diogenes** - Pesquisador(a): **Emerson** <br /><br /> *Laura Inozemtseva and Reid Holmes*. 2014. [Coverage is not strongly correlated with test suite effectiveness](https://doi.org/10.1145/2568225.2568271). In Proceedings of the 36th International Conference on Software Engineering (ICSE 2014). DOI: [https://doi.org/10.1145/2568225.2568271](https://doi.org/10.1145/2568225.2568271). <br /><br /> Dica para o historiador: [Assertions are strongly correlated with test suite effectiveness](https://doi.org/10.1145/2786805.2786858). <br /> Material complementar: [Software unit test coverage and adequacy](https://doi.org/10.1145/267580.267590).
12 | 15/06/2021 (Tue) | TDD+BDD
13 | 17/06/2021 (Thu) | **Discussão de trabalhos** <br /> Apresentador(a): **Vítor** - Historiador(a): **Raquel** - Revisor(a): **Reydne** - Pesquisador(a): **Thayonara** <br /><br /> *Mohammad Ghafari, Timm Gross, Davide Fucci, and Michael Felderer*. 2020. [**Why Research on Test-Driven Development is Inconclusive?**](https://doi.org/10.1145/3382494.3410687) *Proceedings of the 14th ACM / IEEE International Symposium on Empirical Software Engineering and Measurement (ESEM)*. Association for Computing Machinery, New York, NY, USA, Article 25, 1–10. DOI: [https://doi.org/10.1145/3382494.3410687](https://doi.org/10.1145/3382494.3410687)<br /><br />*Adnan Causevic, Daniel Sundmark and Sasikumar Punnekkat*. [**Factors Limiting Industrial Adoption of Test Driven Development: A Systematic Review**](https://doi.org/10.1109/ICST.2011.19). *Fourth IEEE International Conference on Software Testing, Verification and Validation*, Berlin, 2011, pp. 337-346, doi: [https://doi.org/10.1109/ICST.2011.19](https://doi.org/10.1109/ICST.2011.19).
14 | 22/06/2021 (Tue) | **ACOMPANHAMENTO DE PROJETO**
15 | 24/06/2021 (Thu) | **Feriado Estadual --- São João**
