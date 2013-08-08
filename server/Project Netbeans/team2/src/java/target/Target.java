/* ============================================================================
 * Filename     : Target.java
 * ============================================================================
 * Created on   : 7 august 2013
 * ============================================================================
 * Authors      : Arith K Sharma
 *                Grégoire Decorvet
 *                Nagabharan Nagendran
 *                Thomas Schweizer
 * ============================================================================
 */

package target;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * This class is a named point to find on a map.
 * 
 * @author Arith K Sharma
 * @author Grégoire Decorvet
 * @author Nagabharan Nagendran
 * @author Thomas Schweizer
 */
@Entity
public class Target implements Serializable {

   private static final long serialVersionUID = 1L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   @NotNull
   private String name;
   
   @NotNull
   private Double latitude;
   
   @NotNull
   private Double longitude;
   
   public Target() {
      latitude = 0.0;
      longitude = 0.0;
   }

   public Target(String name, Double latitude, Double longitude) {
      this.name = name;
      this.latitude = latitude;
      this.longitude = longitude;
   }
   
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public double getLatitude() {
      return latitude;
   }
   
   public void setLatitude(double latitude) {
      this.latitude = latitude;
   }
   
   public double getLongitude() {
      return longitude;
   }
   
   public void setLongitude(double longitude) {
      this.longitude = longitude;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      if (!(object instanceof Target)) {
         return false;
      }
      Target other = (Target) object;
      if (   (this.id == null && other.id != null)
          || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return name + ":" + latitude + ":" + longitude;
   }
}
