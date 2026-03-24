# 枚举算法

## Question
Martin's father is standing at X₁ meters away from their home. He walks at a constant speed of V₁ meters per step for N steps.
Martin is standing at X₂ meters away from his home. He wonders how fast he must run at some constant speed of V₂ meters per step so as to maximize F, 
where F equals the number of his father's footsteps that Martin will land on during his run. It is given that the first step that Martin will land on, 
from his starting position, will have been landed on by his father.

Note that if more than one prospective velocity results in the same number of maximum common steps, output the highest prospective velocity as V₂.
Write an algorithm to help Martin calculate F and V₂.

### Input
- The first line of the input consists of an integer fatherPos, representing the initial position of Martin's father (X₁).
- The second line consists of an integer martinPos, representing the initial position of Martin (X₂).
- The third line consists of an integer velFather, representing the velocity of the father (V₁).
- The last line consists of an integer steps, representing the number of steps taken by the father (N).

### Output
Print two space-separated integers as the maximum number of common footsteps F and respective speed V₂.

### Constraints
(The constraints are not fully visible in the image, but typical values for this type of problem are small integers for positions, velocities, and steps.)


