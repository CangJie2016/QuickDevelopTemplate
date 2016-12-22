package ${packageName}.ui;

import android.os.Bundle;

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
