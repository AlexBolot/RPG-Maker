<h1>RPG-Maker <a href="https://www.codefactor.io/repository/github/alexbolot/rpg-maker"><img src="https://www.codefactor.io/repository/github/alexbolot/rpg-maker/badge" alt="" /></a></h1>
<h2>Summary :</h2>
<ol>
<li><a href="https://github.com/AlexBolot/RPG-Maker#1---about-the-project ">About the project</a><br />
<ol>
<li><a href="https://github.com/AlexBolot/RPG-Maker#11---the-goal ">The goal</a></li>
</ol>
</li>
<li><a href="https://github.com/AlexBolot/RPG-Maker#2---used-design-patterns ">Used design patterns</a><br />
<ol>
<li><a href="https://github.com/AlexBolot/RPG-Maker/#21---decorator ">Decorator</a></li>
<li><a href="https://github.com/AlexBolot/RPG-Maker/#23---factory ">Factory</a></li>
<li><a href="https://github.com/AlexBolot/RPG-Maker/#24---composite ">Composite</a></li>
</ol>
</li>
<li><a href="https://github.com/AlexBolot/RPG-Maker/#3---coming-soon ">Coming soon</a></li>
<li><a href="https://github.com/AlexBolot/RPG-Maker/#4---libraries ">Libraries</a></li>
<li><a href="https://github.com/AlexBolot/RPG-Maker/#5---author ">Author</a></li>
</ol>
<h2>1 - About the project</h2>
<p>This project is a study project, answering to a school assignment. Assignment&nbsp;subject&nbsp;<a href="https://mbf-iut.i3s.unice.fr/doku.php?id=2016_2017:s3:concprogobjet:td:td7">here</a>.</p>
<h3>1.1 - The goal</h3>
<p>The goal was to use a RPG-Maker subject to use a maximum of design pattern, in order to learn more about them.</p>
<h2>2 - Used design patterns</h2>
<p>How do it work : A Player can create armies, composed of warriors, who hold weapons.</p>
<h3>2.1 - Decorator</h3>
<p>Every weapon can be, at some point Enchanted or Improved. It works with a Decorator pattern.</p>
<h3>2.2 - Factory</h3>
<p>I use factories to create weapons, soldiers and armies (groups), this way it's automated and auto-handled.</p>
<h3>2.3 - Composite</h3>
<p>Groups exist in several forms : Battalion, Army and Horde. An Army can contain Battalions, Hordes, Armies and individual Soldiers. This is why I used the notion of Entity for all of them, this way an Army is composed of as many Entities as needed, no matter their real concrete implementation.</p>
<h2>3 - Coming soon</h2>
<p>Please check the TODO.md file in this repository to find out what updates are planned.</p>
<h2>4 - Libraries</h2>
<p>Only 3 libraries are used for this Maven QuickStart project</p>
<ul>
<li>Java8 : JDK 1.8.111</li>
<li>Maven : JUnit 4.12</li>
<li>Maven : hamcrest-core:1.3</li>
</ul>
<p>Note : those libraries are already included in : org.jetbrains.idea.maven.model.MavenArchetype@88f75e0f</p>
<h2>5 - Author</h2>
<p>Alexandre BOLOT<br />My <a href="https://github.com/AlexBolot">GitHub</a><br />My <a href="https://www.linkedin.com/in/alexandrebolot">LinkedIn</a></p>
