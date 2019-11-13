# MotionLayout Menu
Dribble menu design https://dribbble.com/shots/2653519-Menu built with Android MotionLayout

#### Demo 

Youtube demo https://www.youtube.com/watch?v=CT0qKL3F278

![alt tag](https://raw.githubusercontent.com/faob-dev/MotionLayoutMenuA/master/screenshots/motion_layout_menu.gif)

## Description

In layout file views <b>v1, v2, v3, v4</b> are four menus <b>c1, c2, c3, c4</b> are four background content views and view <b>ic1</b> is down arrow image. My screen height is <b>640dp - 24dp = 616dp (24dp is status bar height)</b>. If you want to change menu size according to your screen resolution open <b>dimens.xml</b> and change menu height in expanded and collapsed state 

<b>menu_expanded_height = 154dp (616dp / 4)</b></br>
<b>menu_collapsed_height = 80dp </b>

Change top margins of each menu according to your screen height to place menus one after another

<b>v1_expanded_margin_top</b></br>
<b>v2_expanded_margin_top</b></br>
<b>v3_expanded_margin_top</b></br>
<b>v4_expanded_margin_top</b></br>

MotionScene file in <b>xml/motion_scene.xml</b> contains comments about each Transition and ConstraintSet. MenuActicity only handles click events and run transitions defined in motion_scene file.
