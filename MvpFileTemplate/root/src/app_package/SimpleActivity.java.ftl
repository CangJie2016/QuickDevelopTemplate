package ${packageName}.ui;

import android.os.Bundle;
import ${packageName}.ui.base.PresenterActivity;
import ${packageName}.presenter.${presenterClass};
import ${packageName}.presenter.view.${viewClass};

public class ${activityClass} extends PresenterActivity<${presenterClass}> implements ${viewClass} {
    @Override
    protected ${presenterClass} createPresenter() {
        return new ${presenterClass}(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<#if generateLayout>
        setContentView(R.layout.${layoutName});
</#if>
    }
}
