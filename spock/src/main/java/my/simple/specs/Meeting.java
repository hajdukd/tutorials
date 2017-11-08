package my.simple.specs;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class Meeting {

    private final List<Participant> participants;

    Meeting() {
        this.participants = new ArrayList();
        participants.add(() -> "Hello, I'm Daniel.");
        participants.add(() -> "Hello, I'm Lukasz.");
        participants.add(() -> "Hello, I'm Pawel.");
    }

    List<Participant> getMeetingParticipants() {
        return participants;
    }

    String greetings() {
        return "Hello, Im a Moderator of this meeting and our guests today are:" +
                participants.stream().map(Participant::sayHello).collect(joining("\n"));
    }
}
