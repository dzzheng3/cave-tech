package cavetech.com.challenge.takehome.data;

import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerDataComponent implements DataComponent {
  private DaggerDataComponent(Builder builder) {  
    assert builder != null;
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static DataComponent create() {  
    return builder().build();
  }

  public static final class Builder {
    private DataModule dataModule;
  
    private Builder() {  
    }
  
    public DataComponent build() {  
      if (dataModule == null) {
        this.dataModule = new DataModule();
      }
      return new DaggerDataComponent(this);
    }
  
    public Builder dataModule(DataModule dataModule) {  
      if (dataModule == null) {
        throw new NullPointerException("dataModule");
      }
      this.dataModule = dataModule;
      return this;
    }
  }
}

