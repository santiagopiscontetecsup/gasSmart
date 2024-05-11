// Generated by view binder compiler. Do not edit!
package com.miempresa.gasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miempresa.gasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeAppBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgHomeFlecha;

  @NonNull
  public final ImageView imgHomeLogo;

  @NonNull
  public final ImageView imgHomeMas;

  @NonNull
  public final ImageView imgHomeSs;

  @NonNull
  public final TextView lblHomeSubtitulo;

  @NonNull
  public final TextView lblHomeTitulo;

  private HomeAppBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgHomeFlecha,
      @NonNull ImageView imgHomeLogo, @NonNull ImageView imgHomeMas, @NonNull ImageView imgHomeSs,
      @NonNull TextView lblHomeSubtitulo, @NonNull TextView lblHomeTitulo) {
    this.rootView = rootView;
    this.imgHomeFlecha = imgHomeFlecha;
    this.imgHomeLogo = imgHomeLogo;
    this.imgHomeMas = imgHomeMas;
    this.imgHomeSs = imgHomeSs;
    this.lblHomeSubtitulo = lblHomeSubtitulo;
    this.lblHomeTitulo = lblHomeTitulo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeAppBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeAppBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_app, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeAppBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_home_flecha;
      ImageView imgHomeFlecha = ViewBindings.findChildViewById(rootView, id);
      if (imgHomeFlecha == null) {
        break missingId;
      }

      id = R.id.img_home_logo;
      ImageView imgHomeLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgHomeLogo == null) {
        break missingId;
      }

      id = R.id.img_home_mas;
      ImageView imgHomeMas = ViewBindings.findChildViewById(rootView, id);
      if (imgHomeMas == null) {
        break missingId;
      }

      id = R.id.img_home_ss;
      ImageView imgHomeSs = ViewBindings.findChildViewById(rootView, id);
      if (imgHomeSs == null) {
        break missingId;
      }

      id = R.id.lbl_home_subtitulo;
      TextView lblHomeSubtitulo = ViewBindings.findChildViewById(rootView, id);
      if (lblHomeSubtitulo == null) {
        break missingId;
      }

      id = R.id.lbl_home_titulo;
      TextView lblHomeTitulo = ViewBindings.findChildViewById(rootView, id);
      if (lblHomeTitulo == null) {
        break missingId;
      }

      return new HomeAppBinding((ConstraintLayout) rootView, imgHomeFlecha, imgHomeLogo, imgHomeMas,
          imgHomeSs, lblHomeSubtitulo, lblHomeTitulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}