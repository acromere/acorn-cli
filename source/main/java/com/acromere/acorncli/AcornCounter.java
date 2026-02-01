package com.acromere.acorncli;

import com.acromere.skill.Controllable;
import com.acromere.skill.Joinable;

import java.util.function.Consumer;

public interface AcornCounter extends Controllable<AcornCounter>, Joinable<AcornCounter> {

	long getTotal();

	long getScore();

	void addListener( Consumer<Long> runnable );

	void removeListener( Consumer<Long> runnable );

}
