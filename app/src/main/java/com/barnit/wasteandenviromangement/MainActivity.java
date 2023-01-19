package com.barnit.wasteandenviromangement;
package com.sunmi.printerhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.sunmi.printerhelper.utils.SunmiPrintHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void PrintReceipt(){
        SunmiPrintHelper.getInstance().initSunmiPrinterService(this);
//        boolean result = InnerPrinterManager.getInstance().bindService(context,
//                innerPrinterCallback);
//        InnerPrinterCallback innerPrinterCallback = new InnerPrinterCallback(){
//            @Override
//            protected void onConnected(SunmiPrinterService service){
////Here is the remote service interface handle after the binding service has been successfully connected
////Supported print methods can be called through service
//            }
//            @Override
//            protected void onDisconnected() {
//
//            }
//        }
//
//
//        innerPrinterCallback.result;
//        result: to show the binding result (succeeded or failed

    }



}
