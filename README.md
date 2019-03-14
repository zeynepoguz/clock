# clock

<h3>Calculate Clock angle</h3>

<p>
Analog clock is a <b>circle</b> so it contains <i>360 degrees</i></br>
<li>
The hour hand turns 360 degrees in 12 hours( 360 * 12 = 720 minutes), <b>0.5 degrees</b>( 360 / 720 = 0.5) per minute.<br></li>
<li>The minute hand turns 360 degrees in 60 minutes, <b>6 degrees</b> per minute</li></br></br>
<p>To calculate the angle between these hands;
<li>First calculate hour hand : hourDegree = <b>0.5</b> * ( (60* hour) + minute )</li>
<li>Then calculate min hand : minDegree = <b>6</b> * minute </li></br>
Finally the result is ;</br></br>
angleBetween = <b>|</b> hourDegree <b>-</b> minDegree <b>|</b>
</p>

</br>

<p>

In the code, there is class called <b>BoundException</b>.</br> This is an user defined <i>exception</i> class.
<li>If the time that entered by user is not between <i>1.00 - 12.00</i> then the main method <b>throw</b>s an exception </br> 
and the class BoundException called.</li></br></br>

<i>For better output ; </i> </br></br>
<code>if (result > 180)
{
System.out.println("Degree(Açı) : " + (360 - result));
 }</br></br>        
           else{
                System.out.println("Degree(Açı) : " + (result)); }
</code>

</p>
</p>

</br></br>
<i>Any</i> question : zeynepoguz16@gmail.com
