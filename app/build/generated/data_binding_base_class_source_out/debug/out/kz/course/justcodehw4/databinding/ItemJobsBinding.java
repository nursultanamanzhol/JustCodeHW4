// Generated by view binder compiler. Do not edit!
package kz.course.justcodehw4.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kz.course.justcodehw4.R;

public final class ItemJobsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnPay;

  @NonNull
  public final ImageView imgLogo;

  @NonNull
  public final TextView jobName;

  private ItemJobsBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnPay,
      @NonNull ImageView imgLogo, @NonNull TextView jobName) {
    this.rootView = rootView;
    this.btnPay = btnPay;
    this.imgLogo = imgLogo;
    this.jobName = jobName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemJobsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemJobsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_jobs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemJobsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPay;
      Button btnPay = ViewBindings.findChildViewById(rootView, id);
      if (btnPay == null) {
        break missingId;
      }

      id = R.id.imgLogo;
      ImageView imgLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgLogo == null) {
        break missingId;
      }

      id = R.id.jobName;
      TextView jobName = ViewBindings.findChildViewById(rootView, id);
      if (jobName == null) {
        break missingId;
      }

      return new ItemJobsBinding((ConstraintLayout) rootView, btnPay, imgLogo, jobName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
