package com.newpro.android.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.newpro.android.bundle.FileItem;
import com.newpro.android.transfer.TransferStatus;
import com.newpro.android.ui.ShareActivity;
import com.newpro.android.ui.transfer.TransferActivity;

import java.io.File;

/**
 * UI navigation tools
 *
 *
 */
public class NavigatorUtils {



    public static void toSystemFileChooser(Context context){
        if(context == null) {
            throw new RuntimeException("Context not be null!!!");
        }

        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        Uri uri = Uri.parse("/download/RshareIT/"); // a directory
        intent.setDataAndType(uri, "*/*");
        context.startActivity(Intent.createChooser(intent, "Open folder"));
    }


}

