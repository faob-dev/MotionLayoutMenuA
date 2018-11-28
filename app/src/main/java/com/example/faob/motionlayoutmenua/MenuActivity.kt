package com.example.faob.motionlayoutmenua

import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import android.support.v7.app.AppCompatActivity
import android.view.View

class MenuActivity : AppCompatActivity() {
    var isMenuCollapsed: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.motion_layout)

        val motionLayout = findViewById<MotionLayout>(R.id.motion_container)

        val v1 = findViewById<View>(R.id.v1)
        val v2 = findViewById<View>(R.id.v2)
        val v3 = findViewById<View>(R.id.v3)
        val v4 = findViewById<View>(R.id.v4)

        v1.setOnClickListener {
            if (isMenuCollapsed) {
                motionLayout.setTransition(R.id.s2, R.id.s1)
            } else {
                motionLayout.setTransition(R.id.s1, R.id.s2)
            }
            motionLayout.transitionToEnd()
            isMenuCollapsed = !isMenuCollapsed
        }
        v2.setOnClickListener {
            if (isMenuCollapsed) {
                motionLayout.setTransition(R.id.s3, R.id.s1)
            } else {
                motionLayout.setTransition(R.id.s1, R.id.s3)
            }
            motionLayout.transitionToEnd()
            isMenuCollapsed = !isMenuCollapsed
        }
        v3.setOnClickListener {
            if (isMenuCollapsed) {
                motionLayout.setTransition(R.id.s4, R.id.s1)
            } else {
                motionLayout.setTransition(R.id.s1, R.id.s4)
            }
            motionLayout.transitionToEnd()
            isMenuCollapsed = !isMenuCollapsed
        }
        v4.setOnClickListener {
            if (isMenuCollapsed) {
                motionLayout.setTransition(R.id.s5, R.id.s1)
            } else {
                motionLayout.setTransition(R.id.s1, R.id.s5)
            }
            motionLayout.transitionToEnd()
            isMenuCollapsed = !isMenuCollapsed
        }
    }
}