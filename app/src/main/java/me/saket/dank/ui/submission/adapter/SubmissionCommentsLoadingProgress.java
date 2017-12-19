package me.saket.dank.ui.submission.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.auto.value.AutoValue;

import me.saket.dank.R;

/**
 * Progress indicator for a submission's comments, shown right below the header.
 */
public interface SubmissionCommentsLoadingProgress {

  @AutoValue
  abstract class UiModel implements SubmissionScreenUiModel {
    @Override
    public abstract long adapterId();

    @Override
    public SubmissionCommentRowType type() {
      return SubmissionCommentRowType.COMMENTS_LOADING_PROGRESS;
    }

    public static UiModel create(long adapterId) {
      return new AutoValue_SubmissionCommentsLoadingProgress_UiModel(adapterId);
    }
  }

  class ViewHolder extends RecyclerView.ViewHolder {
    public static ViewHolder create(LayoutInflater inflater, ViewGroup parent) {
      return new ViewHolder(inflater.inflate(R.layout.list_item_submission_comments_load_progress, parent, false));
    }

    public ViewHolder(View itemView) {
      super(itemView);
    }

    public void bind(UiModel uiModel) {}
  }
}
