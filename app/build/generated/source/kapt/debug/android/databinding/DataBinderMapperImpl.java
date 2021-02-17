package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ru.taximer.taxiandroid.DataBinderMapperImpl());
  }
}
