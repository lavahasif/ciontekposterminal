package com.example.ciontekposterminal

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vpos.apipackage.PosApiHelper
import java.util.*

class MainActivity : AppCompatActivity() {
    var tag = "PrintActivity"

    val RPINT_CONSUME = 0
    val PRINT_UNICODE = 1
    val PRINT_BMP = 2
    val PRINT_BARCODE = 4
    val PRINT_CYCLE = 5
    val PRINT_LONGER = 7
    val PRINT_OPEN = 8

    private val rg: RadioGroup? = null
    private val timer: Timer? = null
    private val timer2: Timer? = null
    private var receiver: BroadcastReceiver? = null
    private var filter: IntentFilter? = null
    private val voltage_level = 0
    private val BatteryV = 0
    var preferences: SharedPreferences? = null
    var sp: SharedPreferences? = null
    var editor: Editor? = null
    private val rb_high: RadioButton? = null
    private val rb_middle: RadioButton? = null
    private val rb_low: RadioButton? = null
    private val radioButton_4: RadioButton? = null
    private val radioButton_5: RadioButton? = null
    private val gb_test: Button? = null
    private val gb_unicode: Button? = null
    private val gb_barcode: Button? = null
    private val btnBmp: Button? = null
    private val ENABLE_RG = 10
    private val DISABLE_RG = 11

    var textViewMsg: TextView? = null
    var textViewGray: TextView? = null
    var ret = -1
    private val m_bThreadFinished = true

    private var is_cycle = false
    private var cycle_num = 0

    private var RESULT_CODE = 0
    //private Pos pos;

    //private Pos pos;
    var IsWorking = 0

    var posApiHelper = PosApiHelper.getInstance()

    var mPrintServiceIntent: Intent? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}