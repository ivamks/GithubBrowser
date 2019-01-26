package com.yggdralisk.githubbrowser.presenttion.main

import android.os.Bundle
import android.view.MenuItem
import com.yggdralisk.githubbrowser.R
import com.yggdralisk.githubbrowser.presenttion.base.BaseDrawerActivity
import com.yggdralisk.githubbrowser.util.extension.toNullable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseDrawerActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSupportActionBar()
    }

    override fun onOptionsItemSelected(item: MenuItem?) = when (item?.itemId) {
        android.R.id.home -> {
            openDrawer()
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

    override fun getDrawerLayout() = mainDrawerLayout.toNullable()

    private fun setupSupportActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }
    }
}